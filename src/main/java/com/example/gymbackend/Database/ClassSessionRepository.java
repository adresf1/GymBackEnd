package com.example.gymbackend.Database;

import com.example.gymbackend.Model.ClassSession;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ClassSessionRepository extends JpaRepository<ClassSession, Long> {
    List<ClassSession> findByGym_GymId(Long gymId); // Alle klasser i et gym
    List<ClassSession> findByTrainer_TrainerId(Long trainerId); // Alle klasser for en træner
}
