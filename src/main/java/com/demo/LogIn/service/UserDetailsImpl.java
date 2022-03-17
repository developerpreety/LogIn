package com.demo.LogIn.service;

import com.demo.LogIn.entity.User;
import com.demo.LogIn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsImpl implements UserLoginServices{
    @Autowired
    private UserRepository userRepository;

      //get users
    public List<User> getUsers() {
       return userRepository.findAll();
    }

    //get user by id
    public  User getUser(String username){
        return userRepository.findByUsername(username).orElseThrow(null);

    }
    //save user
    public User saveUser(User user){
        return userRepository.save(user);
    }


}
