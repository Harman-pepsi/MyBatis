package cn.demo.mapper;

import cn.demo.pojo.Student;

import java.util.List;

public interface IStudentMapper {
    List<Student> findStudentAll();
}
