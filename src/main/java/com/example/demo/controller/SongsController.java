package com.example.demo.controller;

import com.example.demo.dtos.QuestionsDTO;
import com.example.demo.dtos.SongsDTO;
import com.example.demo.entities.dato.Questions;
import com.example.demo.entities.dato.Songs;
import com.example.demo.serviceinterface.IQuestionsService;
import com.example.demo.serviceinterface.ISongsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/canciones")
public class SongsController {
    @Autowired
    private ISongsService sS;

    @PostMapping
    public void registrar(@RequestBody SongsDTO dto){
        ModelMapper m = new ModelMapper();
        Songs q = m.map(dto,Songs.class);
        sS.insertar(q);
    }

    @PutMapping
    public void modificar(@RequestBody SongsDTO dto) {
        ModelMapper m = new ModelMapper();
        Songs pu = m.map(dto, Songs.class);
        sS.insertar(pu);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        sS.eliminar(id);
    }

    @GetMapping("/{id}")
    public SongsDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        SongsDTO dto=m.map(sS.listarId(id),SongsDTO.class);
        return dto;
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<SongsDTO> listar() {
        return sS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,SongsDTO.class);

        }).collect(Collectors.toList());
    }
}
