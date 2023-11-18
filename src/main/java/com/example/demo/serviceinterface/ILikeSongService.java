package com.example.demo.serviceinterface;

import com.example.demo.entities.dato.Gender;
import com.example.demo.entities.entitys.LikesSongs;

import java.util.List;

public interface ILikeSongService {
    public void addLike(LikesSongs likesSongs);
    public List<LikesSongs> Listar();
}
