package com.example.demo.serviceimplements;

import com.example.demo.entities.dato.Gender;
import com.example.demo.repository.IGenderRepository;
import com.example.demo.serviceinterface.IGenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IGenderServiceImplements implements IGenderService {
    @Autowired
    private IGenderRepository gR;

    @Override
    public void insertar(Gender gender) {
        gR.save(gender);
    }

    @Override
    public void eliminar(int idGender) {
        gR.deleteById(idGender);
    }

    @Override
    public Gender listarId(int idGender) {
        return gR.findById(idGender).orElse(new Gender());
    }

    @Override
    public List<Gender> listar() {
        return gR.findAll();
    }
}
