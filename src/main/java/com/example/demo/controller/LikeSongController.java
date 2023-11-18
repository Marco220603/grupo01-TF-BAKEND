package com.example.demo.controller;

import com.example.demo.dtos.GenderDTO;
import com.example.demo.dtos.LikeSongDTO;
import com.example.demo.entities.entitys.LikesSongs;
import com.example.demo.serviceinterface.ILikeSongService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/likes")
public class LikeSongController {
    @Autowired
    private ILikeSongService lsS;
    @PostMapping
    public void addLike(@RequestBody LikeSongDTO dto){
        ModelMapper m = new ModelMapper();
        LikesSongs likesSongs = m.map(dto,LikesSongs.class);
        lsS.addLike(likesSongs);
    }

    @GetMapping
    public List<LikeSongDTO> getLikes(){
        return lsS.Listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, LikeSongDTO.class);
        }).collect(Collectors.toList());
    }
}
