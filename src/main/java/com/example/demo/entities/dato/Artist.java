package com.example.demo.entities.dato;

import javax.persistence.*;

@Entity
@Table(name = "Artist")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name",nullable = false,length = 30)
    private String name;

    @ManyToOne
    private Gender gender_id;


    public Artist() {
    }

    public Artist(int id, String name, Gender gender_id) {
        this.id = id;
        this.name = name;
        this.gender_id = gender_id;
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

    public Gender getGender_id() {
        return gender_id;
    }

    public void setGender_id(Gender gender_id) {
        this.gender_id = gender_id;
    }
}
