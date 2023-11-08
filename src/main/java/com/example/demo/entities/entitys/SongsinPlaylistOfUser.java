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
    @JoinColumn(name = "playlistInUserid")
    private PlaylistInUser playlistInUserid;
    @ManyToOne
    @JoinColumn(name = "songsid")
    private Songs songsid;

    public SongsinPlaylistOfUser() {
    }

    public SongsinPlaylistOfUser(int id, PlaylistInUser playlistInUserid, Songs songsid) {
        this.id = id;
        this.playlistInUserid = playlistInUserid;
        this.songsid = songsid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PlaylistInUser getPlaylistInUserid() {
        return playlistInUserid;
    }

    public void setPlaylistInUserid(PlaylistInUser playlistInUserid) {
        this.playlistInUserid = playlistInUserid;
    }

    public Songs getSongsid() {
        return songsid;
    }

    public void setSongsid(Songs songsid) {
        this.songsid = songsid;
    }
}
