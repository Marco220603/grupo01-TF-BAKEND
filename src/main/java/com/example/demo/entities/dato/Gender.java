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

    public Gender(int idGender, String nameGender) {
        this.idGender = idGender;
        this.nameGender = nameGender;
    }

    public int getIdGender() {
        return idGender;
    }

    public void setIdGender(int idGender) {
        this.idGender = idGender;
    }

    public String getNameGender() {
        return nameGender;
    }

    public void setNameGender(String nameGender) {
        this.nameGender = nameGender;
    }
}
