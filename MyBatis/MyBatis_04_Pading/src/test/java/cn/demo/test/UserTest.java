package cn.demo.test;

import cn.demo.mapper.IUserMapper;
import cn.demo.pojo.User;
import cn.demo.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname UserTest
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/2 22:27
 * @Version V1.0.0
 * @Since 1.0
 */
public class UserTest {

    @Test
    public void testUser(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        IUserMapper userMapper = sqlSession.getMapper(IUserMapper.class);
        Map<String,Integer> map = new HashMap<>();
        map.put("startIndex",0);
        map.put("endIndex",2);
        List<User> userAll = userMapper.getUserAllOfLimit(map);
        for (User user : userAll) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
