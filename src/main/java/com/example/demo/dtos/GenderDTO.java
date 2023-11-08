package com.example.demo.dtos;

import javax.persistence.Column;

public class GenderDTO {
    private int idGender;

    private String nameGender;

    public int getId() {
        return idGender;
    }

    public void setId(int id) {
        this.idGender = id;
    }

    public String getName() {
        return nameGender;
    }

    public void setName(String name) {
        this.nameGender = name;
    }

}
