package com.example.gymbackend.service;

import com.example.gymbackend.Model.ClassSession;
import com.example.gymbackend.Database.ClassSessionRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ClassSessionService {

    private final ClassSessionRepository classSessionRepository;

    public ClassSessionService(ClassSessionRepository classSessionRepository) {
        this.classSessionRepository = classSessionRepository;
    }

    public ClassSession create(ClassSession classSession) {
        return classSessionRepository.save(classSession);
    }

    public List<ClassSession> getAll() {
        return classSessionRepository.findAll();
    }

    public List<ClassSession> getByGym(Long gymId) {
        return classSessionRepository.findByGym_GymId(gymId);
    }

    public List<ClassSession> getByTrainer(Long trainerId) {
        return classSessionRepository.findByTrainer_TrainerId(trainerId);
    }

    public ClassSession getById(Long id) {
        return classSessionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Class not found"));
    }

    public void delete(Long id) {
        classSessionRepository.deleteById(id);
    }
}
