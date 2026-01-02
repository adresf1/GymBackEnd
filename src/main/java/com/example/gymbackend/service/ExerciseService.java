package com.example.gymbackend.service;

import com.example.gymbackend.Model.Exercise;
import com.example.gymbackend.Database.ExerciseRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ExerciseService {

    private final ExerciseRepository exerciseRepository;

    public ExerciseService(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    public Exercise create(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

    public List<Exercise> getAll() {
        return exerciseRepository.findAll();
    }

    public List<Exercise> getByWorkoutPlan(Long planId) {
        return exerciseRepository.findByWorkoutPlan_PlanId(planId);
    }

    public void delete(Long id) {
        exerciseRepository.deleteById(id);
    }
}
