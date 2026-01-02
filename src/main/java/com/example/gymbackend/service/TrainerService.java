package com.example.gymbackend.service;

import com.example.gymbackend.Model.Trainer;
import com.example.gymbackend.Database.TrainerRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TrainerService {

    private final TrainerRepository trainerRepository;

    public TrainerService(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    public Trainer create(Trainer trainer) {
        return trainerRepository.save(trainer);
    }

    public List<Trainer> getAll() {
        return trainerRepository.findAll();
    }

    public Trainer getById(Long id) {
        return trainerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Trainer not found"));
    }

    public void delete(Long id) {
        trainerRepository.deleteById(id);
    }
}

