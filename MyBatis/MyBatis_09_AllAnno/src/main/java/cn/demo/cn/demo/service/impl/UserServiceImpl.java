package cn.demo.cn.demo.service.impl;

import cn.demo.cn.demo.service.IUserService;
import cn.demo.mapper.IUserMapper;
import cn.demo.pojo.User;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Classname UserServiceImpl
 * @Description TODO
 * @Date 2020/11/20 1:11
 * @Created by XJC·AW
 */
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserMapper userMapper;

    @Override
    public List<User> findUserAll() {
        return userMapper.findUserAll();
    }
}
