package com.example.demo.serviceinterface;

import com.example.demo.entities.dato.Gender;

import java.util.List;

public interface IGenderService {
    public void insertar(Gender gender);

    public void eliminar(int genderid);

    public Gender listarId(int genderid);

    List<Gender> listar();
}
