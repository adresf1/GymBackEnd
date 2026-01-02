package com.example.gymbackend.Database;

import com.example.gymbackend.Model.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
    List<Equipment> findByGym_GymId(Long gymId); // Find alle udstyr i et bestemt gym
}
