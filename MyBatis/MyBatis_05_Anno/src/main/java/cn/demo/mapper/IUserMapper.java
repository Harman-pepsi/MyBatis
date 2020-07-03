package cn.demo.mapper;

import cn.demo.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface IUserMapper {
    @Select("select id,username,password from testdb.userinfo where id=#{uid}")
    User getUserById(@Param("uid") Integer id);
}
