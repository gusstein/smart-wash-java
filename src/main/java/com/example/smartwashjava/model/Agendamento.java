package com.example.smartwashjava.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToMany
    private List<Veiculo> veiculos;
    @OneToMany
    private List<Servico> servicos;
    @OneToMany
    private List<Funcionario> funcionarios;
    private Long preco;
    private Date dataEntrada;
    private Date dataSaida;

    public Agendamento() {
    }


}