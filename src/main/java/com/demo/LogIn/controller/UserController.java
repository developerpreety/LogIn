package com.demo.LogIn.controller;

import com.demo.LogIn.entity.User;
import com.demo.LogIn.service.UserLoginServices;
import com.demo.LogIn.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class UserController {
    @Autowired
    private UserLoginServices userLoginServices;
    private final PasswordEncoder passwordEncoder;

@GetMapping("/users")
    public List<User> getUser(){
        return userLoginServices.getUsers();
    }

    @GetMapping("/users/{username}")
    public User getUser(@PathVariable String username){
    return userLoginServices.getUser(username);
    }
    @PostMapping("/register")
    public User saveUser(@RequestBody User user){
      user.setPassword(passwordEncoder.encode(user.getPassword()));
      return userLoginServices.saveUser(user);

    }


}
