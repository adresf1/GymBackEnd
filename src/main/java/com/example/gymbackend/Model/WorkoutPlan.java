package com.example.gymbackend.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class WorkoutPlan {

    @Id
    @GeneratedValue
    private Long planId;

    private String name;
    private String description;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "workoutPlan", cascade = CascadeType.ALL)
    private List<Exercise> exercises;

    public Long getPlanId() {
        return planId;
    }

    public void setPlanId(Long planId) {
        this.planId = planId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }
}
