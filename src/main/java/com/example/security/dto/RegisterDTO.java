package com.example.security.dto;

import lombok.Data;

@Data
public class RegisterDTO {

    String name;
    String email;
    String password;
    String role;
}
