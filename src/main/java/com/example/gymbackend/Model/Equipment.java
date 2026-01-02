package com.example.gymbackend.Model;

import jakarta.persistence.*;

@Entity
public class Equipment {

    @Id
    @GeneratedValue
    private Long equipmentId;

    private String type;
    private int setsAvailable;
    private String status;

    @ManyToOne
    @JoinColumn(name = "gym_id")
    private Gym gym;

    public Long getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Long equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSetsAvailable() {
        return setsAvailable;
    }

    public void setSetsAvailable(int setsAvailable) {
        this.setsAvailable = setsAvailable;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Gym getGym() {
        return gym;
    }

    public void setGym(Gym gym) {
        this.gym = gym;
    }
}

