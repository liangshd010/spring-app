package com.example.demo.bean;

import org.springframework.stereotype.Repository;

@Repository
public class Text {

    public String content;

    public void setContent(String content) {
        this.content = content;
    }
}
