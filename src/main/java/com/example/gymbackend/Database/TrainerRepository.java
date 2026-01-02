package com.example.gymbackend.Database;

import com.example.gymbackend.Model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainerRepository extends JpaRepository<Trainer, Long> {
}
