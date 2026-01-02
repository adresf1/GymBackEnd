package com.example.gymbackend.Controllers;

import Dtos.TrainerResponseDto;
import com.example.gymbackend.Model.Trainer;
import com.example.gymbackend.service.TrainerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trainers")
public class TrainerController {

    private final TrainerService service;

    public TrainerController(TrainerService service) {
        this.service = service;
    }

    @GetMapping
    public List<TrainerResponseDto> getAll() {
        return service.getAll().stream().map(t -> {
            TrainerResponseDto dto = new TrainerResponseDto();
            dto.id = t.getTrainerId();
            dto.firstName = t.getFirstName();
            dto.lastName = t.getLastName();
            dto.certifications = t.getCertifications();
            return dto;
        }).toList();
    }
}
