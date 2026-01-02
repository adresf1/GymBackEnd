package com.example.gymbackend.Mappers;

import Dtos.EquipmentDTO;
import com.example.gymbackend.Model.Equipment;

public class EquipmentMapper {

    public static EquipmentDTO toDto(Equipment equipment) {
        EquipmentDTO dto = new EquipmentDTO();
        dto.id = equipment.getEquipmentId();
        dto.type = equipment.getType();
        dto.setsAvailable = equipment.getSetsAvailable();
        dto.status = equipment.getStatus();
        return dto;
    }
}
