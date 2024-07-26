package org.example.controller;/*
@author 何世吉
*/

import jakarta.annotation.Resource;
import org.example.entity.User;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class test {
    @Autowired
    private UserService userService;

    @GetMapping("list")
    public List<User> list(){
        return userService.selectFirst();
    }
}
