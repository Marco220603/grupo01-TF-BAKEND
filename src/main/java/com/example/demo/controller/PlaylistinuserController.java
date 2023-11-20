package com.example.demo.controller;


import com.example.demo.dtos.CalcularTemperDTO;
import com.example.demo.dtos.PlaylistinuserDTO;

import com.example.demo.dtos.TemperConMayorPuntajeDTO;
import com.example.demo.entities.entitys.Playlistinuser;
import com.example.demo.serviceinterface.IPlaylistinuserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reproducciones")
public class PlaylistinuserController {
    @Autowired
    private IPlaylistinuserService puS;

    @PostMapping
    public void registrar(@RequestBody PlaylistinuserDTO dto){
        ModelMapper m = new ModelMapper();
        Playlistinuser pu = m.map(dto,Playlistinuser.class);
        puS.insertar(pu);
    }

    @PutMapping
    public void modificar(@RequestBody PlaylistinuserDTO dto) {
        ModelMapper m = new ModelMapper();
        Playlistinuser pu = m.map(dto, Playlistinuser.class);
        puS.insertar(pu);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        puS.eliminar(id);
    }

    @GetMapping("/{id}")
    public PlaylistinuserDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        PlaylistinuserDTO dto=m.map(puS.listarId(id),PlaylistinuserDTO.class);
        return dto;
    }

    @GetMapping
    @PreAuthorize("hasAuthority('USER')")
    public List<PlaylistinuserDTO> listar() {
        return puS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,PlaylistinuserDTO.class);

        }).collect(Collectors.toList());
    }

}
