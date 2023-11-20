package com.example.demo.entities.entitys;

import com.example.demo.entities.dato.User;

import javax.persistence.*;

@Entity
@Table(name = "Playlistinuser")
public class Playlistinuser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPlaylistinuser;
    @Column(name = "namePlaylistinuser",nullable = false,length = 30)
    private String namePlaylistinuser;
    @Column(name = "descriptionPlaylistinuser",nullable = false,length = 30)
    private String descriptionPlaylistinuser;
    @OneToOne
    @JoinColumn(name = "usersid")
    private User userid;

    public Playlistinuser() {
    }

    public Playlistinuser(int idPlaylistinuser, String namePlaylistinuser, String descriptionPlaylistinuser, User userid) {
        this.idPlaylistinuser = idPlaylistinuser;
        this.namePlaylistinuser = namePlaylistinuser;
        this.descriptionPlaylistinuser = descriptionPlaylistinuser;
        this.userid = userid;
    }

    public int getIdPlaylistinuser() {
        return idPlaylistinuser;
    }

    public void setIdPlaylistinuser(int idPlaylistinuser) {
        this.idPlaylistinuser = idPlaylistinuser;
    }

    public String getNamePlaylistinuser() {
        return namePlaylistinuser;
    }

    public void setNamePlaylistinuser(String namePlaylistinuser) {
        this.namePlaylistinuser = namePlaylistinuser;
    }

    public String getDescriptionPlaylistinuser() {
        return descriptionPlaylistinuser;
    }

    public void setDescriptionPlaylistinuser(String descriptionPlaylistinuser) {
        this.descriptionPlaylistinuser = descriptionPlaylistinuser;
    }

    public User getUserid() {
        return userid;
    }

    public void setUserid(User userid) {
        this.userid = userid;
    }
}
