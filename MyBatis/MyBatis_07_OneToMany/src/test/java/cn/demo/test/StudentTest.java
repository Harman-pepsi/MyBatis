package cn.demo.test;

import cn.demo.mapper.IStudentMapper;
import cn.demo.pojo.Student;
import cn.demo.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Classname StudentTest
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/3 18:28
 * @Version V1.0.0
 * @Since 1.0
 */
public class StudentTest {
    @Test
    public void testStudent(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        IStudentMapper mapper = sqlSession.getMapper(IStudentMapper.class);
        List<Student> studentAll = mapper.findStudentAll();
        for (Student student : studentAll) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
