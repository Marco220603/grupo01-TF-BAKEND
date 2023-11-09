package com.example.demo.serviceinterface;

import com.example.demo.entities.dato.Gender;

import java.util.List;

public interface IGenderService {
    public void insertar(Gender gender);

    public void eliminar(int idGender);

    public Gender listarId(int idGender);

    public List<Gender> listar();
}
