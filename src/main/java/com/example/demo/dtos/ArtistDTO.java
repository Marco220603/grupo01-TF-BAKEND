package com.example.demo.dtos;


import com.example.demo.entities.dato.Gender;

public class ArtistDTO {
    private int id;

    private String name;
    private Gender genderid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGenderid() {
        return genderid;
    }

    public void setGenderid(Gender genderid) {
        this.genderid = genderid;
    }
}
