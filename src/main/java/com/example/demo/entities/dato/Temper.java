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
    @OneToOne
    @JoinColumn(name = "Gender")
    private Gender Gender;
    @Column(name = "minScore",nullable = false)
    private int minScore;

    public Temper() {
    }

    public Temper(int idtemper, String nametemper, String descriptiontemper, com.example.demo.entities.dato.Gender gender, int minScore) {
        this.idtemper = idtemper;
        this.nametemper = nametemper;
        this.descriptiontemper = descriptiontemper;
        Gender = gender;
        this.minScore = minScore;
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

    public com.example.demo.entities.dato.Gender getGender() {
        return Gender;
    }

    public void setGender(com.example.demo.entities.dato.Gender gender) {
        Gender = gender;
    }

    public int getMinScore() {
        return minScore;
    }

    public void setMinScore(int minScore) {
        this.minScore = minScore;
    }
}
