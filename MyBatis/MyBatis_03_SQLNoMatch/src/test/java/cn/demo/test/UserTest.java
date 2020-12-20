package cn.demo.test;

import cn.demo.mapper.IUserMapper;
import cn.demo.pojo.User;
import cn.demo.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Classname UserTest
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/2 16:55
 * @Version V1.0.0
 * @Since 1.0
 */
public class UserTest {

    @Test
    public void testUser(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        IUserMapper userMapper = sqlSession.getMapper(IUserMapper.class);
        List<User> userAll = userMapper.getUserAll();
        for (User user : userAll) {
            System.out.println(user);
        }
        sqlSession.close();
    }

}
