package com.example.demo.dtos;

import com.example.demo.entities.dato.Artist;
import com.example.demo.entities.dato.Gender;


import java.time.LocalDate;

public class SongsDTO {
    private int idSong;

    private String nameSong;

    private Gender idGender;

    private Artist idArtist;

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

    public Gender getIdGender() {
        return idGender;
    }

    public void setIdGender(Gender idGender) {
        this.idGender = idGender;
    }

    public Artist getIdArtist() {
        return idArtist;
    }

    public void setIdArtist(Artist idArtist) {
        this.idArtist = idArtist;
    }

    public LocalDate getFechaSong() {
        return fechaSong;
    }

    public void setFechaSong(LocalDate fechaSong) {
        this.fechaSong = fechaSong;
    }
}
