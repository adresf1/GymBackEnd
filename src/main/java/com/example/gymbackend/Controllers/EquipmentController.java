package com.example.gymbackend.Controllers;

import Dtos.EquipmentDTO;
import com.example.gymbackend.Model.Equipment;
import com.example.gymbackend.service.EquipmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/equipment")
public class EquipmentController {

    private final EquipmentService service;

    public EquipmentController(EquipmentService service) {
        this.service = service;
    }

    @GetMapping("/gym/{gymId}")
    public List<EquipmentDTO> getByGym(@PathVariable Long gymId) {
        return service.getByGym(gymId).stream().map(e -> {
            EquipmentDTO dto = new EquipmentDTO();
            dto.id = e.getEquipmentId();
            dto.type = e.getType();
            dto.setsAvailable = e.getSetsAvailable();
            dto.status = e.getStatus();
            return dto;
        }).toList();
    }
}
