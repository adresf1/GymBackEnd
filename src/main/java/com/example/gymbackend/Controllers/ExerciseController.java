package com.example.gymbackend.Controllers;

import com.example.gymbackend.Model.Exercise;
import com.example.gymbackend.service.ExerciseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercises")
public class ExerciseController {

    private final ExerciseService exerciseService;

    public ExerciseController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @GetMapping
    public List<Exercise> getAll() {
        return exerciseService.getAll();
    }

    @GetMapping("/plan/{planId}")
    public List<Exercise> getByPlan(@PathVariable Long planId) {
        return exerciseService.getByWorkoutPlan(planId);
    }

    @PostMapping
    public Exercise create(@RequestBody Exercise exercise) {
        return exerciseService.create(exercise);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        exerciseService.delete(id);
    }
}
