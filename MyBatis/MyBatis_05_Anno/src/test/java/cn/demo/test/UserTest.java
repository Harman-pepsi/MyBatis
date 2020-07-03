package cn.demo.test;

import cn.demo.mapper.IUserMapper;
import cn.demo.pojo.User;
import cn.demo.utils.MyBaitsUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname UserTest
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/3 9:33
 * @Version V1.0.0
 * @Since 1.0
 */
public class UserTest {

    @Test
    public void testUser(){
        SqlSession sqlSession = MyBaitsUtil.getSqlSession();
        IUserMapper userMapper = sqlSession.getMapper(IUserMapper.class);
        User user = userMapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }
}
