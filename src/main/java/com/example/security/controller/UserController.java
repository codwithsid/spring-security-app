package com.example.security.controller;

import com.example.security.entity.Users;
import com.example.security.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UsersService usersService;

    @GetMapping("/home")
    public String getHome(){
        return "You are here.";
    }

    @GetMapping("/index")
    public String getIndex(){
        return "You are at Index.";
    }

    @GetMapping("/users")
    @PreAuthorize("hasRole('ADMIN')")
    public List<Users> getAllUsers() {
        return usersService.getAllUsers();
    }
}
