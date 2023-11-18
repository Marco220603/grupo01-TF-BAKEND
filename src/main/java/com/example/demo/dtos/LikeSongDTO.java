package com.example.demo.dtos;

import com.example.demo.entities.dato.Songs;
import com.example.demo.entities.dato.User;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.time.LocalDate;

public class LikeSongDTO {
    private int id;
    private Songs songsid;
    private User usersid;
    private LocalDate date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Songs getSongsid() {
        return songsid;
    }

    public void setSongsid(Songs songsid) {
        this.songsid = songsid;
    }

    public User getUsersid() {
        return usersid;
    }

    public void setUsersid(User usersid) {
        this.usersid = usersid;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
