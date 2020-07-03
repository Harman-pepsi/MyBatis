package cn.demo.mapper;

import cn.demo.pojo.Student;

import java.util.List;

/**
 * @Classname IStudentMapper
 * @Description
 * @Created by XJC·AW
 * @Date 2020/7/3 18:23
 * @Version V1.0.0
 * @Since 1.0
 */
public interface IStudentMapper {
    List<Student> findStudentAll();
}
