package com.example.gymbackend.Controllers;

import Dtos.UserRequestDto;
import Dtos.UserResponseDto;
import com.example.gymbackend.Mappers.UserMapper;
import com.example.gymbackend.Model.User;
import com.example.gymbackend.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<UserResponseDto> getAll() {
        return service.getAllUsers().stream()
                .map(UserMapper::toDto)
                .toList();
    }

    @GetMapping("/{id}")
    public UserResponseDto get(@PathVariable Long id) {
        return UserMapper.toDto(service.getUserById(id));
    }

    @PostMapping
    public UserResponseDto create(@RequestBody UserRequestDto dto) {
        dto.password = passwordencode.hashPassword(dto.password);
        return UserMapper.toDto(
                service.createUser(UserMapper.toEntity(dto))
        );
    }
}
