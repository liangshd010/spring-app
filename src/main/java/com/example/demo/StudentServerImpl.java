package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
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
