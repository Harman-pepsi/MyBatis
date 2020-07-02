package cn.demo.test;

import cn.demo.bean.User;
import cn.demo.mapper.IUserMapper;
import cn.demo.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Classname UserTest
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/2 15:23
 * @Version V1.0.0
 * @Since 1.0
 */
public class UserTest {
    @Test
    public void testFindUserAll(){
        //第一步:获取SqlSession对象
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        //第二步:getMapper(推荐)
        IUserMapper userMapper = sqlSession.getMapper(IUserMapper.class);
        List<User> userAll = userMapper.getUserAll();

        //方式二
        //List<User> userList = sqlSession.selectList("cn.demo.mapper.IUserMapper.getUserAll");

        //遍历
        for (User user : userAll) {
            System.out.println(user);
        }

        //第三步:关闭sqlsession
        sqlSession.close();
    }
}
