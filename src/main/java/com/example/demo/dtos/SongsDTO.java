package com.example.demo.dtos;

import com.example.demo.entities.dato.Artist;
import com.example.demo.entities.dato.Gender;


import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class SongsDTO {
    private int idSong;

    private String nameSong;

    private Gender gender;

    private Artist artist;

    private LocalDate fechaSong;

    public int getIdSong() {
        return idSong;
    }

    public void setIdSong(int idSong) {
        this.idSong = idSong;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public LocalDate getFechaSong() {
        return fechaSong;
    }

    public void setFechaSong(LocalDate fechaSong) {
        this.fechaSong = fechaSong;
    }
}
