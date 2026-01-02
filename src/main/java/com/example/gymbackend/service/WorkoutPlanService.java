package com.example.gymbackend.service;

import com.example.gymbackend.Model.WorkoutPlan;
import com.example.gymbackend.Database.WorkoutPlanRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class WorkoutPlanService {

    private final WorkoutPlanRepository workoutPlanRepository;

    public WorkoutPlanService(WorkoutPlanRepository workoutPlanRepository) {
        this.workoutPlanRepository = workoutPlanRepository;
    }

    public WorkoutPlan create(WorkoutPlan plan) {
        return workoutPlanRepository.save(plan);
    }

    public List<WorkoutPlan> getAll() {
        return workoutPlanRepository.findAll();
    }

    public WorkoutPlan getById(Long id) {
        return workoutPlanRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("WorkoutPlan not found"));
    }

    public List<WorkoutPlan> getByUser(Long userId) {
        return workoutPlanRepository.findByUser_UserId(userId);
    }

    public void delete(Long id) {
        workoutPlanRepository.deleteById(id);
    }
}
