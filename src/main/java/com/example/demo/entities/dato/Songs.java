package com.example.demo.entities.dato;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Songs")
public class Songs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSong;
    @Column(name = "nameSong",nullable = false,length = 30)
    private String nameSong;
    @ManyToOne
    @JoinColumn(name = "idGender")
    private Gender gender;
    @ManyToOne
    @JoinColumn(name = "idArtist")
    private Artist artist;
    @Column(name = "fechaSong",nullable = false)
    private LocalDate fechaSong;

    public Songs() {
    }

    public Songs(int idSong, String nameSong, Gender gender, Artist artist, LocalDate fechaSong) {
        this.idSong = idSong;
        this.nameSong = nameSong;
        this.gender = gender;
        this.artist = artist;
        this.fechaSong = fechaSong;
    }

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
