package com.example.smartwashjava.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("_id")
    private Long id;
    @ManyToMany
    private List<Veiculo> veiculos;
    @ManyToMany
    private List<Servico> servicos;
    @ManyToMany
    private List<Funcionario> funcionarios;
    private Long preco;
    private Date dataEntrada;
    private Date dataSaida;

    public Agendamento() {
    }


}