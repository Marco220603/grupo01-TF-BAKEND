package com.example.demo.controller;

import com.example.demo.dtos.ArtistDTO;
import com.example.demo.entities.dato.Artist;
import com.example.demo.serviceinterface.IArtistService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/artist")
public class ArtistController {
    @Autowired
    private IArtistService aS;

    @PostMapping
    public void registrar(@RequestBody ArtistDTO dto){
        ModelMapper m = new ModelMapper();
        Artist a = m.map(dto,Artist.class);
        aS.insertar(a);
    }

    @PutMapping
    public void modificar(@RequestBody ArtistDTO dto) {
        ModelMapper m = new ModelMapper();
        Artist a = m.map(dto, Artist.class);
        aS.insertar(a);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        aS.eliminar(id);
    }

    @GetMapping("/{id}")
    public ArtistDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        ArtistDTO dto=m.map(aS.listarId(id),ArtistDTO.class);
        return dto;
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<ArtistDTO> listar() {
        return aS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ArtistDTO.class);

        }).collect(Collectors.toList());
    }
}
