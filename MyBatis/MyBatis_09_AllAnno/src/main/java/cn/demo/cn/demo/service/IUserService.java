package cn.demo.cn.demo.service;

import cn.demo.pojo.User;

import java.util.List;

/**
 * @Classname IUserService
 * @Description TODO
 * @Date 2020/11/20 1:11
 * @Created by XJC·AW
 */
public interface IUserService {
    List<User> findUserAll();
}
