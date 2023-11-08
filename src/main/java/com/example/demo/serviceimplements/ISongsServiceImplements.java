package com.example.demo.serviceimplements;

import com.example.demo.entities.dato.Songs;
import com.example.demo.repository.ISongsRepository;
import com.example.demo.serviceinterface.ISongsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ISongsServiceImplements implements ISongsService {
    @Autowired
    private ISongsRepository sR;

    @Override
    public void insertar(Songs songs) {
        sR.save(songs);
    }

    @Override
    public void eliminar(int idsongs) {
        sR.deleteById(idsongs);
    }

    @Override
    public Songs listarId(int idsoongs) {
        return sR.findById(idsoongs).orElse(new Songs());
    }

    @Override
    public List<Songs> listar() {
        return sR.findAll();
    }
}
