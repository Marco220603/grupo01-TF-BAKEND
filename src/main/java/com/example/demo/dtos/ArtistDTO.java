package com.example.demo.dtos;


import com.example.demo.entities.dato.Gender;



public class ArtistDTO {
    private int idartist;

    private String nameartist;

    private Gender genderid;

    public int getIdartist() {
        return idartist;
    }

    public void setIdartist(int idartist) {
        this.idartist = idartist;
    }

    public String getNameartist() {
        return nameartist;
    }

    public void setNameartist(String nameartist) {
        this.nameartist = nameartist;
    }

    public Gender getGenderid() {
        return genderid;
    }

    public void setGenderid(Gender genderid) {
        this.genderid = genderid;
    }
}
