package com.example.demo.dtos;

import javax.persistence.Column;

public class GenderDTO {
    private int idGender;

    private String nameGender;

    public int getIdGender() {
        return idGender;
    }

    public void setIdGender(int idGender) {
        this.idGender = idGender;
    }

    public String getNameGender() {
        return nameGender;
    }

    public void setNameGender(String nameGender) {
        this.nameGender = nameGender;
    }
}
