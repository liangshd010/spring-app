package com.example.demo.controller;

import com.example.demo.service.UserService;
import com.example.demo.service.UserServiceImpl;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@MapperScan("com.example.demo")
@RestController
@RequestMapping("/testBoot")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("getUser/{id}")
    public String getUser(@PathVariable int id) {
        return  userService.sel(id).toString();
    }
}
