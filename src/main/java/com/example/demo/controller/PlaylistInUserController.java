package com.example.demo.controller;


import com.example.demo.dtos.PlaylistInUserDTO;

import com.example.demo.entities.entitys.PlaylistInUser;

import com.example.demo.serviceinterface.IPlaylistInUserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/playlist")
public class PlaylistInUserController {
    @Autowired
    private IPlaylistInUserService puS;

    @PostMapping
    public void registrar(@RequestBody PlaylistInUserDTO dto){
        ModelMapper m = new ModelMapper();
        PlaylistInUser pu = m.map(dto,PlaylistInUser.class);
        puS.insertar(pu);
    }

    @PutMapping
    public void modificar(@RequestBody PlaylistInUserDTO dto) {
        ModelMapper m = new ModelMapper();
        PlaylistInUser pu = m.map(dto, PlaylistInUser.class);
        puS.insertar(pu);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        puS.eliminar(id);
    }

    @GetMapping("/{id}")
    public PlaylistInUserDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        PlaylistInUserDTO dto=m.map(puS.listarId(id),PlaylistInUserDTO.class);
        return dto;
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<PlaylistInUserDTO> listar() {
        return puS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,PlaylistInUserDTO.class);

        }).collect(Collectors.toList());
    }
}
