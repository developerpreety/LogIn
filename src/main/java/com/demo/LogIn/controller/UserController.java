package com.demo.LogIn.controller;

import com.demo.LogIn.entity.User;
import com.demo.LogIn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }
    @GetMapping("/users/**")
    public String getUser(){
        return "WELCOME";
    }
    @PostMapping("/register")
    public String signUp(@RequestBody User user){
       userService.saveUser(user);
        return "<h1>WELCOME USER<h1>";
    }
    @PostMapping("/logIn")
    public String logIn(@RequestBody String username){

       for(User u:userService.getUsers()) {
           if (u.getUsername().equals(username))
               return "Log in successful";
           else
               throw new UsernameNotFoundException("User Not Found, Please Register");

       }
       return "Welcome User";

    }


}
