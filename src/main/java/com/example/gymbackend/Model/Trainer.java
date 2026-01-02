package com.example.gymbackend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Trainer {

    @Id
    @GeneratedValue
    private Long trainerId;

    private String firstName;
    private String lastName;
    private String certifications;

    @OneToMany(mappedBy = "trainer")
    private List<ClassSession> classes;

    public Long getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(Long trainerId) {
        this.trainerId = trainerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCertifications() {
        return certifications;
    }

    public void setCertifications(String certifications) {
        this.certifications = certifications;
    }

    public List<ClassSession> getClasses() {
        return classes;
    }

    public void setClasses(List<ClassSession> classes) {
        this.classes = classes;
    }
}
