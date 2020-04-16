package com.example.demo.service;

import com.example.demo.bean.Text;

import java.util.List;

public interface TextService {
    public Integer insert(Text text) ;
    public List<Text> findAll();
}
