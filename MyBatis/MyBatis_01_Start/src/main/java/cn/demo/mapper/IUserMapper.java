package cn.demo.mapper;

import cn.demo.bean.User;

import java.util.List;

/**
 * @Classname IUserMapper
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/2 14:48
 * @Version V1.0.0
 * @Since 1.0
 */
public interface IUserMapper {
    List<User> getUserAll();
}
