package com.example.demo.dtos;


import com.example.demo.entities.dato.Gender;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class ArtistDTO {
    private int idArtist;
    private String nameArtist;
    private Gender gender;

    public int getIdArtist() {
        return idArtist;
    }

    public void setIdArtist(int idArtist) {
        this.idArtist = idArtist;
    }

    public String getNameArtist() {
        return nameArtist;
    }

    public void setNameArtist(String nameArtist) {
        this.nameArtist = nameArtist;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
