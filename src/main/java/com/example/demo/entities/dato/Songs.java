package com.example.demo.entities.dato;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Songs")
public class Songs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSong;
    @Column(name = "title",nullable = false,length = 30)
    private String nameSong;
    @ManyToOne
    @JoinColumn(name = "idGender")
    private Gender idGender;
    @ManyToOne
    @JoinColumn(name = "idArtist")
    private Artist idArtist;
    @Column(name = "fechaSong",nullable = false)
    private LocalDate fechaSong;

    public Songs() {
    }

    public Songs(int idSong, String nameSong, Gender idGender, Artist idArtist, LocalDate fechaSong) {
        this.idSong = idSong;
        this.nameSong = nameSong;
        this.idGender = idGender;
        this.idArtist = idArtist;
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
