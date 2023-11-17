package com.example.demo.serviceinterface;

import com.example.demo.entities.dato.Temper;

import java.util.List;

public interface ITemperService {
    public void insertar(Temper temper);

    public void eliminar(int idtemper);

    public Temper listarId(int idtemper);

    public List<Temper> listar();
}
