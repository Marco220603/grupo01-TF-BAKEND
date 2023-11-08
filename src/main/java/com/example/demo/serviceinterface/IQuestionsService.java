package com.example.demo.serviceinterface;

import com.example.demo.entities.dato.Questions;

import java.util.List;

public interface IQuestionsService {
    public void insertar(Questions questions);

    public void eliminar(int idquestions);

    public Questions listarId(int idquestions);

    List<Questions> listar();

    public List<String[]>calcularTemper();
}
