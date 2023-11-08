package com.example.demo.entities.entitys;

import com.example.demo.entities.dato.User;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "Playlistinuser")
public class PlaylistInUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name",nullable = false,length = 30)
    private String name;
    @Column(name = "description",nullable = false,length = 30)
    private String description;
    @OneToOne
    @JoinColumn(name = "usersid")
    private User userid;

    public PlaylistInUser() {
    }

    public PlaylistInUser(int id, String name, String description, User userid) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.userid = userid;
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

    public User getUserid() {
        return userid;
    }

    public void setUserid(User userid) {
        this.userid = userid;
    }
}
