package com.example.demo.serviceinterface;

import com.example.demo.entities.entitys.Playlistinuser;

import java.util.List;

public interface IPlaylistinuserService {
    public void insertar(Playlistinuser playlistinuser);

    public void eliminar(int idplaylistinuser);

    public Playlistinuser listarId(int idplaylistinuser);

    List<Playlistinuser> listar();
    
}
