package com.example.gymbackend.Mappers;

import Dtos.GymResponseDto;
import com.example.gymbackend.Model.Gym;

public class GymMapper {

    public static GymResponseDto toDto(Gym gym) {
        GymResponseDto dto = new GymResponseDto();
        dto.id = gym.getGymId();
        dto.name = gym.getName();
        dto.address = gym.getAddress();
        dto.openingHours = gym.getOpeningHours();
        return dto;
    }
}
