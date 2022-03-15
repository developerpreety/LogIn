package com.demo.LogIn.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name="users_tbl")
public class User {
        @Id
        private String username;
        private String password;

        @Column(unique = true)
        private String email;
        private String status;

      /*  public String setPassword(String password){
                return new BCryptPasswordEncoder().encode(password);
        }*/


        }
