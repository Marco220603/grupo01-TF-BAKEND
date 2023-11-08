package com.example.demo.serviceimplements;

import com.example.demo.entities.entitys.PlaylistInUser;
import com.example.demo.repository.IPlaylistInUserRepository;
import com.example.demo.serviceinterface.IPlaylistInUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IPlaylistInUserServiceImplements implements IPlaylistInUserService {
    @Autowired
    private IPlaylistInUserRepository puR;

    @Override
    public void insertar(PlaylistInUser playlistInUser) {
        puR.save(playlistInUser);
    }

    @Override
    public void eliminar(int idplaylistinuser) {
        puR.deleteById(idplaylistinuser);
    }

    @Override
    public PlaylistInUser listarId(int idplaylistinuser) {
        return puR.findById(idplaylistinuser).orElse(new PlaylistInUser());
    }

    @Override
    public List<PlaylistInUser> listar() {
        return puR.findAll();
    }
}
