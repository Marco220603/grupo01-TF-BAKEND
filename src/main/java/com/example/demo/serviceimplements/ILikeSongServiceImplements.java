package com.example.demo.serviceimplements;

import com.example.demo.entities.entitys.LikesSongs;
import com.example.demo.repository.ILikeSongsRepository;
import com.example.demo.serviceinterface.ILikeSongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ILikeSongServiceImplements implements ILikeSongService {
    @Autowired
    private ILikeSongsRepository lsR;

    @Override
    public void addLike(LikesSongs likesSongs) {
        lsR.save(likesSongs);
    }

    @Override
    public List<LikesSongs> Listar() {
        return lsR.findAll();
    }
}
