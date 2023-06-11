package com.example.smartwashjava.controller;

import com.example.smartwashjava.model.Usuario;
import com.example.smartwashjava.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@AllArgsConstructor
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    //@RequestMapping(method = RequestMapping.GET)
    @GetMapping
    public @ResponseBody List<Usuario> list() {
        return usuarioRepository.findAll();
    }

}
