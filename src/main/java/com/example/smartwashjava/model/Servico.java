package com.example.smartwashjava.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String nome;
    @Column
    private Long preco;
    @Column
    private String descricao;
    @Column
    private String duracao;
    @Column
    private Long avaliacao;

    public Servico() {
    }

}

