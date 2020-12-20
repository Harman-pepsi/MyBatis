package cn.demo.mapper;

import cn.demo.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IUserMapper {
    List<User> getUserAll();
}
