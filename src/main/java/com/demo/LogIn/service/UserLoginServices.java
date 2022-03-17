package com.demo.LogIn.service;

import com.demo.LogIn.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserLoginServices {
    User saveUser(User user);
    User getUser(String username);
    List<User> getUsers();
}
