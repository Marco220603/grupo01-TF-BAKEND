package com.example.demo.serviceinterface;

import com.example.demo.entities.dato.Songs;

import java.util.List;

public interface ISongsService {
    public void insertar(Songs songs);

    public void eliminar(int idsongs);

    public Songs listarId(int idsoongs);

    List<Songs> listar();
}
