package com.example.gymbackend.Mappers;

import Dtos.WorkoutPlanResponseDto;
import com.example.gymbackend.Model.WorkoutPlan;

public class WorkoutPlanMapper {

    public static WorkoutPlanResponseDto toDto(WorkoutPlan plan) {
        WorkoutPlanResponseDto dto = new WorkoutPlanResponseDto();
        dto.id = plan.getPlanId();
        dto.name = plan.getName();
        dto.description = plan.getDescription();
        return dto;
    }
}
