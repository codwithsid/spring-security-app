package com.example.security.service.impl;

import com.example.security.entity.Users;
import com.example.security.repository.UsersRepository;
import com.example.security.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersRepository usersRepository;

    @Override
    public List<Users> getAllUsers(){
        return usersRepository.findAll();
    }

}
