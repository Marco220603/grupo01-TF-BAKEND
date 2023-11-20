package com.example.demo.entities.entitys;

import com.example.demo.entities.dato.Songs;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "Songsinplaylistofuser")
public class SongsinPlaylistOfUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToOne
    @JoinColumn(name = "playlistinuserid")
    private Playlistinuser playlistinuserid;
    @ManyToOne
    @JoinColumn(name = "songsid")
    private Songs songsid;

    public SongsinPlaylistOfUser() {
    }

    public SongsinPlaylistOfUser(int id, Playlistinuser playlistInUserid, Songs songsid) {
        this.id = id;
        this.playlistinuserid = playlistinuserid;
        this.songsid = songsid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Playlistinuser getPlaylistInUserid() {
        return playlistinuserid;
    }

    public void setPlaylistInUserid(Playlistinuser playlistinuserid) {
        this.playlistinuserid = playlistinuserid;
    }

    public Songs getSongsid() {
        return songsid;
    }

    public void setSongsid(Songs songsid) {
        this.songsid = songsid;
    }
}
