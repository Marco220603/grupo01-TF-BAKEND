package com.example.demo.serviceinterface;

import com.example.demo.entities.entitys.PlaylistInUser;

import java.util.List;

public interface IPlaylistInUserService {
    public void insertar(PlaylistInUser playlistInUser);

    public void eliminar(int idplaylistinuser);

    public PlaylistInUser listarId(int idplaylistinuser);

    List<PlaylistInUser> listar();
}
