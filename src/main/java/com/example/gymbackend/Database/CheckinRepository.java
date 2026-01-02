package com.example.gymbackend.Database;

import com.example.gymbackend.Model.Checkin;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CheckinRepository extends JpaRepository<Checkin, Long> {
    List<Checkin> findByUser_UserId(Long userId); // Find alle checkins for en bruger
    List<Checkin> findByGym_GymId(Long gymId);   // Find alle checkins i et gym
}
