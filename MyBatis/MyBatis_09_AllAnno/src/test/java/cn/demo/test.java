package cn.demo;

import cn.demo.cn.demo.service.IUserService;
import cn.demo.cn.demo.service.impl.UserServiceImpl;
import cn.demo.pojo.User;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Classname test
 * @Description TODO
 * @Date 2020/11/20 1:12
 * @Created by XJC·AW
 */
public class test {

    @Resource
    private IUserService iUserService;

    @Test
    public void test(){
        List<User> userAll = iUserService.findUserAll();
        for (User user : userAll) {
            System.out.println(user);
        }
    }
}
