package com.example.gymbackend.Mappers;

import Dtos.CheckinResponseDto;
import com.example.gymbackend.Model.Checkin;

public class CheckinMapper {

    public static CheckinResponseDto toDto(Checkin checkin) {
        CheckinResponseDto dto = new CheckinResponseDto();
        dto.id = checkin.getCheckinId();
        dto.timestamp = checkin.getTimestamp();
        dto.userId = checkin.getUser().getUserId();
        dto.gymId = checkin.getGym().getGymId();
        return dto;
    }
}
