package com.example.gymbackend.Mappers;

import Dtos.ClassSessionResponseDto;
import com.example.gymbackend.Model.ClassSession;

public class ClassSessionMapper {

    public static ClassSessionResponseDto toDto(ClassSession session) {
        ClassSessionResponseDto dto = new ClassSessionResponseDto();
        dto.id = session.getClassId();
        dto.name = session.getName();
        dto.startTime = session.getStartTime();
        dto.duration = session.getDuration();
        dto.maxParticipants = session.getMaxParticipants();
        return dto;
    }
}
