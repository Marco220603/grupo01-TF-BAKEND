package com.example.demo.entities.dato;

import javax.persistence.*;

@Entity
@Table(name = "Temper")
public class Temper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name",nullable = false,length = 30)
    private String name;
    @Column(name = "description",nullable = false,length = 200)
    private String description;
    @OneToOne
    @JoinColumn(name = "genderid")
    private Gender genderid;
    @Column(name = "minScore",nullable = false)
    private int minScore;

    public Temper() {
    }

    public Temper(int id, String name, String description, Gender genderid) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.genderid = genderid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Gender getGenderid() {
        return genderid;
    }

    public void setGenderid(Gender genderid) {
        this.genderid = genderid;
    }

    public int getMinScore() {
        return minScore;
    }

    public void setMinScore(int minScore) {
        this.minScore = minScore;
    }
}
