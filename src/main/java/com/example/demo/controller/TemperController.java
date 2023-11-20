package com.example.demo.controller;

import com.example.demo.dtos.SongsDTO;
import com.example.demo.dtos.TemperConMayorPuntajeDTO;
import com.example.demo.dtos.TemperDTO;
import com.example.demo.entities.dato.Songs;
import com.example.demo.entities.dato.Temper;
import com.example.demo.serviceinterface.ISongsService;
import com.example.demo.serviceinterface.ITemperService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/temperamentos")
public class TemperController {
    @Autowired
    private ITemperService sS;

    @PostMapping
    public void registrar(@RequestBody TemperDTO dto){
        ModelMapper m = new ModelMapper();
        Temper q = m.map(dto,Temper.class);
        sS.insertar(q);
    }

    @PutMapping
    public void modificar(@RequestBody TemperDTO dto) {
        ModelMapper m = new ModelMapper();
        Temper pu = m.map(dto, Temper.class);
        sS.insertar(pu);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        sS.eliminar(id);
    }
    @GetMapping("/{id}")
    public TemperDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        TemperDTO dto=m.map(sS.listarId(id),TemperDTO.class);
        return dto;
    }
    @GetMapping
    public List<TemperDTO> listar() {
        return sS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,TemperDTO.class);

        }).collect(Collectors.toList());
    }
    @GetMapping("/TemperConMayorPuntaje")
    public List<TemperConMayorPuntajeDTO> TemperConMayorPuntaje(){
        List<String[]> TemperConMayorPuntaje = sS.TemperConMayorPuntaje();
        List<TemperConMayorPuntajeDTO> TemperConMayorPuntajeDTOS = new ArrayList<>();
        for (String[] data: TemperConMayorPuntaje){
            TemperConMayorPuntajeDTO dto = new TemperConMayorPuntajeDTO();
            dto.setName(data[0]);
            dto.setTotalscore(Integer.parseInt(data[1]));
            dto.setTemper(data[2]);
            TemperConMayorPuntajeDTOS.add(dto);
        }
        return TemperConMayorPuntajeDTOS;
    }
}
