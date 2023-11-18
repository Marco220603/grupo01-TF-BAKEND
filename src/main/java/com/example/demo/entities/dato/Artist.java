package com.example.demo.entities.dato;

import javax.persistence.*;

@Entity
@Table(name = "Artist")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idArtist;
    @Column(name = "nameArtist",nullable = false,length = 30)
    private String nameArtist;
    @ManyToOne
    @JoinColumn(name = "idGender")
    private Gender gender;

    public Artist() {
    }

    public Artist(int idArtist, String nameArtist, Gender gender) {
        this.idArtist = idArtist;
        this.nameArtist = nameArtist;
        this.gender = gender;
    }

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
