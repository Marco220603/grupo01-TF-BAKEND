package com.example.demo.entities.dato;

import javax.persistence.*;

@Entity
@Table(name = "Artist")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idartist;
    @Column(name = "name",nullable = false,length = 30)
    private String nameartist;

    @ManyToOne
    @JoinColumn(name = "idGender")
    private Gender genderid;


    public Artist() {
    }

    public Artist(int idartist, String nameartist, Gender genderid) {
        this.idartist = idartist;
        this.nameartist = nameartist;
        this.genderid = genderid;
    }

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
