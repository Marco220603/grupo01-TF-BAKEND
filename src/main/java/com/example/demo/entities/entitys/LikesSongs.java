package com.example.demo.entities.entitys;

import com.example.demo.entities.dato.Songs;
import com.example.demo.entities.dato.User;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
@Entity
@Table(name = "likessongs")
public class LikesSongs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    @JoinColumn(name = "songsid")
    private Songs songsid;
    @ManyToOne
    @JoinColumn(name = "usersid")
    private User usersid;
    @Column(name = "date",nullable = false)
    private LocalDate date;

    public LikesSongs() {
    }

    public LikesSongs(int id, User usersid, Songs songsid, LocalDate date) {
        this.id = id;
        this.usersid = usersid;
        this.songsid = songsid;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUsersid() {
        return usersid;
    }

    public void setUsersid(User usersid) {
        this.usersid = usersid;
    }

    public Songs getSongsid() {
        return songsid;
    }

    public void setSongsid(Songs songsid) {
        this.songsid = songsid;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
