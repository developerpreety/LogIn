package com.demo.LogIn.controller;

import com.demo.LogIn.entity.User;
import com.demo.LogIn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/users")
    public List<User> getUser(){
        return userService.getUsers();
    }
    @GetMapping("/users/{id}")
    public User getUser(@PathVariable String username){
        return userService.getUser(username);
    }
    @PostMapping("/register")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }
    @GetMapping("/register/**")
    public String home(){
        return "<h1>WELCOME USER<h1>";
    }
}
