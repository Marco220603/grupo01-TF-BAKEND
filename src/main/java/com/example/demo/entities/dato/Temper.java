package com.example.demo.entities.dato;

import javax.persistence.*;

@Entity
@Table(name = "Temper")
public class Temper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idtemper;
    @Column(name = "nametemper",nullable = false,length = 30)
    private String nametemper;
    @Column(name = "descriptiontemper",nullable = false,length = 200)
    private String descriptiontemper;
    @Column(name = "minScore",nullable = false)
    private int minScore;
    @ManyToOne
    @JoinColumn(name = "idGender",nullable = false)
    private Gender gender;

    public Temper() {
    }

    public Temper(int idtemper, String nametemper, String descriptiontemper, int minScore, Gender gender) {
        this.idtemper = idtemper;
        this.nametemper = nametemper;
        this.descriptiontemper = descriptiontemper;
        this.minScore = minScore;
        this.gender = gender;
    }

    public int getIdtemper() {
        return idtemper;
    }

    public void setIdtemper(int idtemper) {
        this.idtemper = idtemper;
    }

    public String getNametemper() {
        return nametemper;
    }

    public void setNametemper(String nametemper) {
        this.nametemper = nametemper;
    }

    public String getDescriptiontemper() {
        return descriptiontemper;
    }

    public void setDescriptiontemper(String descriptiontemper) {
        this.descriptiontemper = descriptiontemper;
    }

    public int getMinScore() {
        return minScore;
    }

    public void setMinScore(int minScore) {
        this.minScore = minScore;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
