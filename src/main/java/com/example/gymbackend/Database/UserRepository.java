package com.example.gymbackend.Database;
import com.example.gymbackend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);  // Eksempel på custom query
}
