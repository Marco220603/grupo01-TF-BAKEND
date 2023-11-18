package com.example.demo.serviceimplements;

import com.example.demo.entities.dato.Artist;
import com.example.demo.repository.IArtitsRepository;
import com.example.demo.serviceinterface.IArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IArtistServiceImplements implements IArtistService {
    @Autowired
    private IArtitsRepository aR;
    @Override
    public void insertar(Artist artist) {
        aR.save(artist);
    }

    @Override
    public void eliminar(int idArtist) {
        aR.deleteById(idArtist);
    }

    @Override
    public Artist listarId(int idArtist) {
        return aR.findById(idArtist).orElse(new Artist());
    }

    @Override
    public List<Artist> listar() {
        return aR.findAll();
    }
}
