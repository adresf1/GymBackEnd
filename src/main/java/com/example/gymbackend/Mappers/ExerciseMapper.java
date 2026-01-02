package com.example.gymbackend.Mappers;

import Dtos.ExerciseResponseDto;
import com.example.gymbackend.Model.Exercise;

public class ExerciseMapper {

    public static ExerciseResponseDto toDto(Exercise exercise) {
        ExerciseResponseDto dto = new ExerciseResponseDto();
        dto.id = exercise.getExerciseId();
        dto.name = exercise.getName();
        dto.muscleGroup = exercise.getMuscleGroup();
        dto.sets = exercise.getSets();
        dto.reps = exercise.getReps();
        dto.weight = exercise.getWeight();
        return dto;
    }
}
