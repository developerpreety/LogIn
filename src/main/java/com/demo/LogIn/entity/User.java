package com.demo.LogIn.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

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
        private String email;
        private String status;
        private String role;

        }
