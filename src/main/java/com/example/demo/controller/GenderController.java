package com.example.demo.controller;


import com.example.demo.dtos.GenderDTO;

import com.example.demo.entities.dato.Gender;
import com.example.demo.serviceinterface.IGenderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/generos")
public class GenderController {
    @Autowired
    private IGenderService gS;

    @PostMapping
    public void registrar(@RequestBody GenderDTO dto){
        ModelMapper m = new ModelMapper();
        Gender g = m.map(dto,Gender.class);
        gS.insertar(g);
    }

    @PutMapping
    public void modificar(@RequestBody GenderDTO dto) {
        ModelMapper m = new ModelMapper();
        Gender g = m.map(dto, Gender.class);
        gS.insertar(g);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        gS.eliminar(id);
    }

    @GetMapping("/{id}")
    public GenderDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        GenderDTO dto=m.map(gS.listarId(id),GenderDTO.class);
        return dto;
    }

    @GetMapping
    public List<GenderDTO> listar() {
        return gS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,GenderDTO.class);

        }).collect(Collectors.toList());
    }
}
