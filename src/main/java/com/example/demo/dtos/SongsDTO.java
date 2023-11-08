package com.example.demo.dtos;

import com.example.demo.entities.dato.Artist;
import com.example.demo.entities.dato.Gender;

import java.util.List;

public class SongsDTO {
    private int id;

    private String title;

    private Gender genderid;
    private Artist artistid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Gender getGenderid() {
        return genderid;
    }

    public void setGenderid(Gender genderid) {
        this.genderid = genderid;
    }

    public Artist getArtistid() {
        return artistid;
    }

    public void setArtistid(Artist artistid) {
        this.artistid = artistid;
    }
}
