package com.example.gymbackend.Database;

import com.example.gymbackend.Model.Gym;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GymRepository extends JpaRepository<Gym, Long> {
}
