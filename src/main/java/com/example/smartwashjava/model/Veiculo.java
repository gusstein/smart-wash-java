package com.example.smartwashjava.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String modelo;
    private String marca;
    private String ano;
    private String placa;
    private String carroceria;

    public Veiculo () {
    }

}