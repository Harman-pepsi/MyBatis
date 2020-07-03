package cn.demo.test;

import cn.demo.mapper.IEmployerMapper;
import cn.demo.pojo.Employer;
import cn.demo.utils.MyBatisUtil;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * @Classname EmployerTest
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/4 2:04
 * @Version V1.0.0
 * @Since 1.0
 */
public class EmployerTest {
    private SqlSession sqlSession;
    private IEmployerMapper mapper;

    private Logger logger = Logger.getLogger(EmployerTest.class);

    @Before
    public void init(){
        sqlSession = MyBatisUtil.getSqlSession();
        mapper = sqlSession.getMapper(IEmployerMapper.class);
    }

    @Test
    public void testEmployer(){

        List<Employer> employerAll = mapper.findEmployerAll();
        for (Employer employer : employerAll) {
            System.out.println(employer);
        }
        sqlSession.close();
    }

    @Test
    public void testFindEmployerByCondition(){
        Map<String,Object> map = new HashMap<>();
        map.put("gender","男");
        map.put("age",20);
        List<Employer> employerByCondition = mapper.findEmployerByCondition(map);
        for (Employer employer : employerByCondition) {
            System.out.println(employer);
        }
        sqlSession.close();
    }

    @Test
    public void insertEmployer(){
        Employer employer = new Employer();
        employer.setId(UUID.randomUUID().toString().replace("-",""));
        employer.setName("王五");
        employer.setGender("男");
        employer.setAge(28);
        employer.setIntime(new Date());
        employer.setWages(19999.9d);
        int iResult = mapper.insertEmployer(employer);
        if(iResult > 0){
            System.out.println("插入成功!");
        }else{
            System.out.println("插入失败!");
        }
    }
}
