package com.example.demo.serviceimplements;

import com.example.demo.entities.entitys.Playlistinuser;
import com.example.demo.repository.IPlaylistinuserRepository;
import com.example.demo.serviceinterface.IPlaylistinuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IPlaylistinuserServiceImplements implements IPlaylistinuserService {
    @Autowired
    private IPlaylistinuserRepository puR;

    @Override
    public void insertar(Playlistinuser playlistinuser) {
        puR.save(playlistinuser);
    }

    @Override
    public void eliminar(int idPlaylistinuser) {
        puR.deleteById(idPlaylistinuser);
    }

    @Override
    public Playlistinuser listarId(int idPlaylistinuser) {
        return puR.findById(idPlaylistinuser).orElse(new Playlistinuser());
    }

    @Override
    public List<Playlistinuser> listar() {
        return puR.findAll();
    }
}
