package com.example.demo.dtos;

import com.example.demo.entities.dato.Gender;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class TemperDTO {
    private int idTemper;
    private String nameTemper;
    private String descriptionTemper;
    private int minScore;
    private Gender gender;

    public int getIdTemper() {
        return idTemper;
    }

    public void setIdTemper(int idTemper) {
        this.idTemper = idTemper;
    }

    public String getNameTemper() {
        return nameTemper;
    }

    public void setNameTemper(String nameTemper) {
        this.nameTemper = nameTemper;
    }

    public String getDescriptionTemper() {
        return descriptionTemper;
    }

    public void setDescriptionTemper(String descriptionTemper) {
        this.descriptionTemper = descriptionTemper;
    }

    public int getMinScore() {
        return minScore;
    }

    public void setMinScore(int minScore) {
        this.minScore = minScore;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
