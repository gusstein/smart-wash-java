package com.example.smartwashjava.controller;

import lombok.AllArgsConstructor;
import com.example.smartwashjava.model.Agendamento;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.smartwashjava.repository.AgendamentoRepository;

import java.util.List;

@RestController
@RequestMapping("/api/agendamentos")
@AllArgsConstructor
public class AgendamentoController {

    private final AgendamentoRepository agendamentoRepository;

    //@RequestMapping(method = RequestMapping.GET)
    @GetMapping
    public List<Agendamento> list() {
        return agendamentoRepository.findAll();
    }

}
