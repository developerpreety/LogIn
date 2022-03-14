package com.demo.LogIn.service;

import com.demo.LogIn.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {
    private List<User> list = new ArrayList<>();



    //get all users
    public List<User> getUsers() {
        return list;
    }

    //get user by id
    public User getUser(String username) {
        return this.list.stream().filter(user -> user.getUsername().equals(username)).findAny().get();
    }

    //save user
    public User saveUser(User user){
         list.add(user);
         return user;
    }
}
