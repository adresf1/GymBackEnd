package com.example.gymbackend.Mappers;

import Dtos.TrainerResponseDto;
import com.example.gymbackend.Model.Trainer;

public class TrainerMapper {

    public static TrainerResponseDto toDto(Trainer trainer) {
        TrainerResponseDto dto = new TrainerResponseDto();
        dto.id = trainer.getTrainerId();
        dto.firstName = trainer.getFirstName();
        dto.lastName = trainer.getLastName();
        dto.certifications = trainer.getCertifications();
        return dto;
    }
}
