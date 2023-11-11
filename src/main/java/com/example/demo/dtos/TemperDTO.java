package com.example.demo.dtos;

import com.example.demo.entities.dato.Gender;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class TemperDTO {
    private int idtemper;
    private String nametemper;

    private String descriptiontemper;
    private Gender Gender;
    private int minScore;

    public int getIdtemper() {
        return idtemper;
    }

    public void setIdtemper(int idtemper) {
        this.idtemper = idtemper;
    }

    public String getNametemper() {
        return nametemper;
    }

    public void setNametemper(String nametemper) {
        this.nametemper = nametemper;
    }

    public String getDescriptiontemper() {
        return descriptiontemper;
    }

    public void setDescriptiontemper(String descriptiontemper) {
        this.descriptiontemper = descriptiontemper;
    }

    public com.example.demo.entities.dato.Gender getGender() {
        return Gender;
    }

    public void setGender(com.example.demo.entities.dato.Gender gender) {
        Gender = gender;
    }

    public int getMinScore() {
        return minScore;
    }

    public void setMinScore(int minScore) {
        this.minScore = minScore;
    }
}
