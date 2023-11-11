package com.example.demo.entities.dato;

import javax.persistence.*;

@Entity
@Table(name = "Songs")
public class Songs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "title",nullable = false,length = 30)
    private String title;
    @ManyToOne
    @JoinColumn(name = "artistid")
    private Artist artistid;
    @ManyToOne
    @JoinColumn(name = "genderid")
    private Gender genderid;
    public Songs() {
    }

    public Songs(int id, String title, Artist artistid, Gender genderid) {
        this.id = id;
        this.title = title;
        this.artistid = artistid;
        this.genderid = genderid;
    }

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

    public Artist getArtistid() {
        return artistid;
    }

    public void setArtistid(Artist artistid) {
        this.artistid = artistid;
    }

    public Gender getGenderid() {
        return genderid;
    }

    public void setGenderid(Gender genderid) {
        this.genderid = genderid;
    }
}
