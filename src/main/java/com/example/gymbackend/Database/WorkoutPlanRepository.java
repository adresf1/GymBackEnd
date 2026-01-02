package com.example.gymbackend.Database;

import com.example.gymbackend.Model.WorkoutPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface WorkoutPlanRepository extends JpaRepository<WorkoutPlan, Long> {
    List<WorkoutPlan> findByUser_UserId(Long userId); // Find alle planer for en bruger
}
