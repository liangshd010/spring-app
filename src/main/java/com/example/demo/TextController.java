package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class TextController {

    @Autowired
    private TextServiceImpl textServiceImpl;

    @RequestMapping("/text")
    public String text(Model model, HttpServletRequest request) {
        List<Text> textList = textServiceImpl.findAll();
        model.addAttribute("textList", textList);
        return "text";
    }

    @RequestMapping("/insert")
    public String insert(String content, Model model, HttpServletRequest request) {
        System.out.println("oooooooo");
        Text text = new Text();
        text.setContent(content);
        System.out.println(content);
        Integer i = textServiceImpl.insert(text);
        if(i==1){
            System.out.println("插入成功");
        }
        List<Text> textList = textServiceImpl.findAll();
        System.out.println(textList.toString());
        model.addAttribute("textList",textList);
        return "text";
    }
}
