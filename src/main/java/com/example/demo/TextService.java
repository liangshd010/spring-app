package com.example.demo;

import java.util.List;

public interface TextService {
    public Integer insert(Text text) ;
    public List<Text> findAll();
}
