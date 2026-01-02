package com.example.gymbackend.service;

import com.example.gymbackend.Model.Gym;
import com.example.gymbackend.Database.GymRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class GymService {

    private final GymRepository gymRepository;

    public GymService(GymRepository gymRepository) {
        this.gymRepository = gymRepository;
    }

    public Gym create(Gym gym) {
        return gymRepository.save(gym);
    }

    public List<Gym> getAll() {
        return gymRepository.findAll();
    }

    public Gym getById(Long id) {
        return gymRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Gym not found"));
    }

    public void delete(Long id) {
        gymRepository.deleteById(id);
    }
}
