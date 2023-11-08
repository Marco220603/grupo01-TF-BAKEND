package com.example.demo.entities.dato;

import javax.persistence.*;

@Entity
@Table(name = "Gender")
public class Gender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name",nullable = false,length = 30)
    private String name;
    @Column(name = "description",nullable = false,length = 30)
    private String description;

    // hopoa
    public Gender() {

    }

    public Gender(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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
}
