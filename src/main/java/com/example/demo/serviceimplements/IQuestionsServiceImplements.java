package com.example.demo.serviceimplements;

import com.example.demo.entities.dato.Questions;
import com.example.demo.repository.IQuestiosnsRepository;
import com.example.demo.serviceinterface.IQuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IQuestionsServiceImplements implements IQuestionsService {
    @Autowired
    private IQuestiosnsRepository qR;

    @Override
    public void insertar(Questions questions) {
        qR.save(questions);
    }

    @Override
    public void eliminar(int idquestions) {
        qR.deleteById(idquestions);
    }

    @Override
    public Questions listarId(int idquestions) {
        return qR.findById(idquestions).orElse(new Questions());
    }

    @Override
    public List<Questions> listar() {
        return qR.findAll();
    }

    @Override
    public List<String[]> calcularTemper() {
        return qR.calcularTemper();
    }


}
