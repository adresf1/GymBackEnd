package com.example.gymbackend.Model;
import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String firstName;
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    private String passwordHash;

    private String membershipType;

    private LocalDate joinDate;

    // relationer
    @OneToMany(mappedBy = "user")
    private List<WorkoutPlan> workoutPlans;

    @OneToMany(mappedBy = "user")
    private List<Checkin> checkins;

    public Long getUserId() {
        return userId;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public List<Checkin> getCheckins() {
        return checkins;
    }

    public List<WorkoutPlan> getWorkoutPlans() {
        return workoutPlans;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public void setWorkoutPlans(List<WorkoutPlan> workoutPlans) {
        this.workoutPlans = workoutPlans;
    }

    public void setCheckins(List<Checkin> checkins) {
        this.checkins = checkins;
    }
}
