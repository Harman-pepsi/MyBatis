package cn.demo.mapper;

import cn.demo.pojo.User;

import java.util.List;
import java.util.Map;

public interface IUserMapper {
    List<User> getUserAllOfLimit(Map<String,Integer> map);
}
