package com.example.demo.dtos;

import com.example.demo.entities.dato.User;



public class PlaylistinuserDTO {
    private int idPlaylistinuser;

    private String namePlaylistinuser;

    private String descriptionPlaylistinuser;

    private User userid;

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
