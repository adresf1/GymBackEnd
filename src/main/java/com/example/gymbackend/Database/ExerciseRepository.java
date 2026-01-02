package com.example.gymbackend.Database;

import com.example.gymbackend.Model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
    List<Exercise> findByWorkoutPlan_PlanId(Long planId); // Find alle øvelser i en plan
}
