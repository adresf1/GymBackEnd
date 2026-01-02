package com.example.gymbackend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Gym {

    @Id
    @GeneratedValue
    private Long gymId;

    private String name;
    private String address;
    private String openingHours;

    @OneToMany(mappedBy = "gym")
    private List<Equipment> equipment;

    @OneToMany(mappedBy = "gym")
    private List<ClassSession> classes;

    public Long getGymId() {
        return gymId;
    }

    public void setGymId(Long gymId) {
        this.gymId = gymId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    public List<Equipment> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<Equipment> equipment) {
        this.equipment = equipment;
    }

    public List<ClassSession> getClasses() {
        return classes;
    }

    public void setClasses(List<ClassSession> classes) {
        this.classes = classes;
    }
}
