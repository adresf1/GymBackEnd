package com.example.gymbackend.Controllers;

import Dtos.GymResponseDto;
import com.example.gymbackend.service.GymService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gyms")
public class GymController {

    private final GymService service;

    public GymController(GymService service) {
        this.service = service;
    }

    @GetMapping
    public List<GymResponseDto> getAll() {
        return service.getAll().stream().map(g -> {
            GymResponseDto dto = new GymResponseDto();
            dto.id = g.getGymId();
            dto.name = g.getName();
            dto.address = g.getAddress();
            dto.openingHours = g.getOpeningHours();
            return dto;
        }).toList();
    }
}
