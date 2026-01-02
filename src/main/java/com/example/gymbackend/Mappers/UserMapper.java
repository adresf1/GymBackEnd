package com.example.gymbackend.Mappers;

import Dtos.UserRequestDto;
import Dtos.UserResponseDto;
import com.example.gymbackend.Model.User;

import java.time.LocalDate;

public class UserMapper {

    public static UserResponseDto toDto(User user) {
        UserResponseDto dto = new UserResponseDto();
        dto.id = user.getUserId();
        dto.firstName = user.getFirstName();
        dto.lastName = user.getLastName();
        dto.email = user.getEmail();
        dto.membershipType = user.getMembershipType();
        return dto;
    }

    public static User toEntity(UserRequestDto dto) {
        User user = new User();
        user.setFirstName(dto.firstName);
        user.setLastName(dto.lastName);
        user.setEmail(dto.email);
        user.setPasswordHash(dto.password); // senere hash
        user.setMembershipType(dto.membershipType);
        user.setJoinDate(LocalDate.now());
        return user;
    }
}
