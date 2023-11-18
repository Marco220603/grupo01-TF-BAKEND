package com.example.demo.entities.dato;

import javax.persistence.*;

@Entity
@Table(name = "Temper")
public class Temper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTemper;
    @Column(name = "nameTemper",nullable = false,length = 30)
    private String nameTemper;
    @Column(name = "descriptionTemper",nullable = false,length = 200)
    private String descriptionTemper;
    @Column(name = "minScore",nullable = false)
    private int minScore;
    @ManyToOne
    @JoinColumn(name = "idGender",nullable = false)
    private Gender gender;
    public Temper() {
    }
    public Temper(int idTemper, String nameTemper, String descriptionTemper, int minScore, Gender gender) {
        this.idTemper = idTemper;
        this.nameTemper = nameTemper;
        this.descriptionTemper = descriptionTemper;
        this.minScore = minScore;
        this.gender = gender;
    }
    public int getIdTemper() {
        return idTemper;
    }

    public void setIdTemper(int idTemper) {
        this.idTemper = idTemper;
    }

    public String getNameTemper() {
        return nameTemper;
    }

    public void setNameTemper(String nameTemper) {
        this.nameTemper = nameTemper;
    }

    public String getDescriptionTemper() {
        return descriptionTemper;
    }

    public void setDescriptionTemper(String descriptionTemper) {
        this.descriptionTemper = descriptionTemper;
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
