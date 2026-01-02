package com.example.gymbackend.Controllers;

import Dtos.WorkoutPlanResponseDto;
import com.example.gymbackend.Model.WorkoutPlan;
import com.example.gymbackend.service.WorkoutPlanService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/workout-plans")
public class WorkoutPlanController {

    private final WorkoutPlanService service;

    public WorkoutPlanController(WorkoutPlanService service) {
        this.service = service;
    }

    @GetMapping("/user/{userId}")
    public List<WorkoutPlanResponseDto> getByUser(@PathVariable Long userId) {
        return service.getByUser(userId).stream().map(p -> {
            WorkoutPlanResponseDto dto = new WorkoutPlanResponseDto();
            dto.id = p.getPlanId();
            dto.name = p.getName();
            dto.description = p.getDescription();
            return dto;
        }).toList();
    }
}
