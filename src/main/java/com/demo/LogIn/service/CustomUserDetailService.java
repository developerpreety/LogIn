package com.demo.LogIn.service;

import com.demo.LogIn.entity.CustomUserDetails;
import com.demo.LogIn.entity.User;
import com.demo.LogIn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
      User user= userRepository.findByUsername(username).orElseThrow(()->new UsernameNotFoundException("User not found"+ username));

      return UserService.build(user);
    }
}
