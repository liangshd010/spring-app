package com.example.demo.service;

import com.example.demo.bean.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentServer {
    List<Student> getStudentList();
}
