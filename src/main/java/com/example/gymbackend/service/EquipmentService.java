package com.example.gymbackend.service;

import com.example.gymbackend.Model.Equipment;
import com.example.gymbackend.Database.EquipmentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class EquipmentService {

    private final EquipmentRepository equipmentRepository;

    public EquipmentService(EquipmentRepository equipmentRepository) {
        this.equipmentRepository = equipmentRepository;
    }

    public Equipment create(Equipment equipment) {
        return equipmentRepository.save(equipment);
    }

    public List<Equipment> getAll() {
        return equipmentRepository.findAll();
    }

    public List<Equipment> getByGym(Long gymId) {
        return equipmentRepository.findByGym_GymId(gymId);
    }

    public Equipment getById(Long id) {
        return equipmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Equipment not found"));
    }

    public void delete(Long id) {
        equipmentRepository.deleteById(id);
    }
}
