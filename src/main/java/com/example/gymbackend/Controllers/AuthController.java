package com.example.gymbackend.Controllers;

import Dtos.LoginRequestDto;
import com.example.gymbackend.Model.User;
import com.example.gymbackend.jwt.JwtUtil;
import com.example.gymbackend.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;
    private final JwtUtil jwtUtil;

    public AuthController(UserService userService, JwtUtil jwtUtil) {
        this.userService = userService;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestBody LoginRequestDto dto) {

        User user = userService.loginUser(dto.email, dto.password);
        String token = jwtUtil.generateToken(user);

        return Map.of("token", token);
    }
}

