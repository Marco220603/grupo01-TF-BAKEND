package com.example.demo.serviceinterface;

import com.example.demo.entities.dato.Artist;

import java.util.List;

public interface IArtistService {
    public void insertar(Artist artist);

    public void eliminar(int idartist);

    public Artist listarId(int idartist);

    List<Artist> listar();
}
