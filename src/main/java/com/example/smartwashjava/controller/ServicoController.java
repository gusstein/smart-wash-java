package com.example.smartwashjava.controller;

import com.example.smartwashjava.model.Servico;
import com.example.smartwashjava.repository.ServicoRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/servicos")
@AllArgsConstructor
public class ServicoController {

    private final ServicoRepository servicoRepository;

    //@RequestMapping(method = RequestMapping.GET)
    @GetMapping
    public List<Servico> list() {
        return servicoRepository.findAll();
    }

}
