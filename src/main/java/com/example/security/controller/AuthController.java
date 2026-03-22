package com.example.security.controller;

import com.example.security.dto.LogInDTO;
import com.example.security.dto.RegisterDTO;
import com.example.security.entity.Users;
import com.example.security.service.AuthService;
import com.example.security.service.JwtService;
import com.example.security.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthController {
    @Autowired
    private AuthService authService;

    @Autowired
    private JwtService jwtService;

    @PostMapping("/register")
    public String register(@RequestBody RegisterDTO registerDto) {
        return authService.register(registerDto);
    }

    @PostMapping("/login")
    public String login(@RequestBody LogInDTO loginDto) {

        Users user = authService.login(loginDto);

        UserDetails userDetails = org.springframework.security.core.userdetails.User
                .builder()
                .username(user.getEmail())
                .password(user.getPassword())
                .roles(user.getRole()) // make sure role is like "USER"
                .build();

        return jwtService.generateToken(userDetails);
    }

}
