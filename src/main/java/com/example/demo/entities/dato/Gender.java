package com.example.demo.entities.dato;

import javax.persistence.*;

@Entity
@Table(name = "Gender")
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGender;
    @Column(name = "nameGender",nullable = false,length = 48)
    private String nameGender;
    // hopoa
    public Gender() {

    }

    public Gender(int id, String name) {
        this.idGender = id;
        this.nameGender = name;
    }

    public int getId() {
        return idGender;
    }

    public void setId(int id) {
        this.idGender = id;
    }

    public String getName() {
        return nameGender;
    }

    public void setName(String name) {
        this.nameGender = name;
    }
}
