package com.example.gymbackend.Controllers;

import Dtos.ClassSessionResponseDto;
import com.example.gymbackend.Model.ClassSession;
import com.example.gymbackend.service.ClassSessionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/classes")
public class ClassSessionController {

    private final ClassSessionService service;

    public ClassSessionController(ClassSessionService service) {
        this.service = service;
    }

    @GetMapping
    public List<ClassSessionResponseDto> getAll() {
        return service.getAll().stream().map(c -> {
            ClassSessionResponseDto dto = new ClassSessionResponseDto();
            dto.id = c.getClassId();
            dto.name = c.getName();
            dto.startTime = c.getStartTime();
            dto.duration = c.getDuration();
            dto.maxParticipants = c.getMaxParticipants();
            return dto;
        }).toList();
    }
}
