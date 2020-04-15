package com.example.demo;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentMapper {

    @Select("select id, name, age from students")
    List<Student> getStudentList();
}
