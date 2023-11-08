package com.example.demo.serviceimplements;

import com.example.demo.entities.dato.Temper;
import com.example.demo.repository.ITemperRepository;
import com.example.demo.serviceinterface.ITemperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ITemperServiceImplements implements ITemperService {
    @Autowired
    private ITemperRepository tS;

    @Override
    public void insertar(Temper temper) {
        tS.save(temper);
    }

    @Override
    public void eliminar(int idtemper) {
        tS.deleteById(idtemper);
    }

    @Override
    public Temper listarId(int idtemper) {
        return tS.findById(idtemper).orElse(new Temper());
    }

    @Override
    public List<Temper> listar() {
        return tS.findAll();
    }
}
