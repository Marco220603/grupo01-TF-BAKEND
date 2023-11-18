package com.example.demo.controller;


import com.example.demo.dtos.CalcularTemperDTO;
import com.example.demo.dtos.QuestionsDTO;
import com.example.demo.entities.dato.Questions;

import com.example.demo.serviceinterface.IQuestionsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/preguntas")
public class QuestionsController {
    @Autowired
    private IQuestionsService qS;

    @PostMapping
    public void registrar(@RequestBody QuestionsDTO dto){
        ModelMapper m = new ModelMapper();
        Questions q = m.map(dto,Questions.class);
        qS.insertar(q);
    }

    @PutMapping
    public void modificar(@RequestBody QuestionsDTO dto) {
        ModelMapper m = new ModelMapper();
        Questions pu = m.map(dto, Questions.class);
        qS.insertar(pu);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        qS.eliminar(id);
    }

    @GetMapping("/{id}")
    public QuestionsDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        QuestionsDTO dto=m.map(qS.listarId(id),QuestionsDTO.class);
        return dto;
    }

    @GetMapping
    public List<QuestionsDTO> listar() {
        return qS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,QuestionsDTO.class);

        }).collect(Collectors.toList());
    }
    @GetMapping("/calculartemper")
    public List<CalcularTemperDTO> calculartemper(){
        List<String[]> calculartemper = qS.calcularTemper();
        List<CalcularTemperDTO> calcularTemperDTOS = new ArrayList<>();
        for (String[] data: calculartemper){
            CalcularTemperDTO dto = new CalcularTemperDTO();
            dto.setName(data[0]);
            dto.setTotalscore(Integer.parseInt(data[1]));
            dto.setTemper(data[2]);
            calcularTemperDTOS.add(dto);
        }
        return calcularTemperDTOS;
    }
}
