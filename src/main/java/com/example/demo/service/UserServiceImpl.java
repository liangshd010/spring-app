package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserServiceImpl implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public User sel(int id) {
//        User u = new User();
//        u.setId(1);
//        u.setRealName("lsd");
//        return u;
        return userMapper.sel(id);
    }
}
