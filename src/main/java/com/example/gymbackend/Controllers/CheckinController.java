package com.example.gymbackend.Controllers;

import com.example.gymbackend.Model.Checkin;
import com.example.gymbackend.service.CheckinService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/checkins")
public class CheckinController {

    private final CheckinService checkinService;

    public CheckinController(CheckinService checkinService) {
        this.checkinService = checkinService;
    }

    @GetMapping
    public List<Checkin> getAll() {
        return checkinService.getAll();
    }

    @GetMapping("/user/{userId}")
    public List<Checkin> getByUser(@PathVariable Long userId) {
        return checkinService.getByUser(userId);
    }

    @GetMapping("/gym/{gymId}")
    public List<Checkin> getByGym(@PathVariable Long gymId) {
        return checkinService.getByGym(gymId);
    }

    @PostMapping
    public Checkin create(@RequestBody Checkin checkin) {
        return checkinService.create(checkin);
    }
}
