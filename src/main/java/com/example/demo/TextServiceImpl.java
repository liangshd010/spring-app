package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class TextServiceImpl implements TextService {

    private List<Text> textList = new LinkedList<>();

    @Override
    public Integer insert(Text text) {
        textList.add(text);
        return 1;
    }

    @Override
    public List<Text> findAll() {
        return textList;
    }
}
