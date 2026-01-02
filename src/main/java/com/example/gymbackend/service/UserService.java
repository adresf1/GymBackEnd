package com.example.gymbackend.service;

import com.example.gymbackend.Controllers.passwordencode;
import com.example.gymbackend.Model.User;
import com.example.gymbackend.Database.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public  List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    //login
    //login
    public User loginUser(String username, String password) {
        User user = userRepository.findByEmail(username)
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (!passwordencode.checkPassword(password, user.getPasswordHash())) {
            throw new RuntimeException("Invalid password");
        }
        return user;
    }

}
