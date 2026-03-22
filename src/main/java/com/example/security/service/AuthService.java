package com.example.security.service;

import com.example.security.dto.LogInDTO;
import com.example.security.dto.RegisterDTO;
import com.example.security.entity.Users;
import com.example.security.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    UsersRepository repo;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private AuthenticationManager authenticationManager;

    public String register(RegisterDTO input) {
        Users user = new Users();
        user.setName(input.getName());
        user.setEmail(input.getEmail());
        user.setPassword(passwordEncoder.encode(input.getPassword()));
        user.setRole(input.getRole());

        repo.save(user);
        return "User Added Successfully";
    }

    public Users login(LogInDTO input) {
        Users user = repo.findByEmail(input.getEmail());

        if (user != null && passwordEncoder.matches(input.getPassword(), user.getPassword())) {
            authenticationManager
                    .authenticate(new UsernamePasswordAuthenticationToken(
                            input.getEmail(), input.getPassword()));
            return user;
        }

        return null;

    }
}
