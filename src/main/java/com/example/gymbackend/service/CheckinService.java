package com.example.gymbackend.service;

import com.example.gymbackend.Model.Checkin;
import com.example.gymbackend.Database.CheckinRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class CheckinService {

    private final CheckinRepository checkinRepository;

    public CheckinService(CheckinRepository checkinRepository) {
        this.checkinRepository = checkinRepository;
    }

    public Checkin create(Checkin checkin) {
        return checkinRepository.save(checkin);
    }

    public List<Checkin> getAll() {
        return checkinRepository.findAll();
    }

    public List<Checkin> getByUser(Long userId) {
        return checkinRepository.findByUser_UserId(userId);
    }

    public List<Checkin> getByGym(Long gymId) {
        return checkinRepository.findByGym_GymId(gymId);
    }
}
