package com.example.smartwashjava.controller;

import com.example.smartwashjava.model.Veiculo;
import com.example.smartwashjava.repository.VeiculoRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/veiculos")
@AllArgsConstructor
public class VeiculoController {

    private final VeiculoRepository veiculoRepository;

    //@RequestMapping(method = RequestMapping.GET)
    @GetMapping
    public @ResponseBody List<Veiculo> list() {
        return veiculoRepository.findAll();
    }

}
