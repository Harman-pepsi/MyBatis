package cn.demo.mapper;

import cn.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Classname IUserMapper
 * @Description TODO
 * @Date 2020/11/20 1:10
 * @Created by XJC·AW
 */
@Mapper
public interface IUserMapper {
    @Select("select * from userinfo")
    List<User> findUserAll();
}
