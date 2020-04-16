package com.example.demo.service;

import com.example.demo.bean.Student;
import com.example.demo.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentServerImpl implements StudentServer {

    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> getStudentList() {
//        Student a = new Student(2, "lsd", 20, "M",170);

        List<Student> list = studentMapper.getStudentList();
        return list;
    }
}
