package com.example.smartwashjava;

import com.example.smartwashjava.model.Agendamento;
import com.example.smartwashjava.model.Servico;
import com.example.smartwashjava.model.Veiculo;
import com.example.smartwashjava.repository.ServicoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.smartwashjava.repository.AgendamentoRepository;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class SmartWashJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartWashJavaApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(ServicoRepository servicoRepository) {
		return args -> {
			servicoRepository.deleteAll();

//			// Criando objetos fictícios para veículos
//			Veiculo veiculo1 = new Veiculo();
//			veiculo1.setModelo("Gol");
//			veiculo1.setMarca("Volkswagen");
//			veiculo1.setAno("2020");
//			veiculo1.setPlaca("ABC123");
//			veiculo1.setCarroceria("Hatchback");
//
//			Veiculo veiculo2 = new Veiculo();
//			veiculo2.setModelo("Civic");
//			veiculo2.setMarca("Honda");
//			veiculo2.setAno("2019");
//			veiculo2.setPlaca("XYZ789");
//			veiculo2.setCarroceria("Sedan");
//
//			// Criando objetos fictícios para serviços
//			Servico servico1 = new Servico();
//			servico1.setNome("Lavagem");
//			servico1.setPreco(50L);
//			servico1.setDescricao("Lavagem externa e interna do veículo");
//			servico1.setDuracao("1 hora");
//			servico1.setAvaliacao(4L);
//
//			Servico servico2 = new Servico();
//			servico2.setNome("Polimento");
//			servico2.setPreco(100L);
//			servico2.setDescricao("Polimento da pintura do veículo");
//			servico2.setDuracao("2 horas");
//			servico2.setAvaliacao(5L);
//
//			// Criando lista de veículos e adicionando os objetos criados
//			List<Veiculo> veiculos = new ArrayList<>();
//			veiculos.add(veiculo1);
//			veiculos.add(veiculo2);
//
//			// Criando lista de serviços e adicionando os objetos criados
//			List<Servico> servicos = new ArrayList<>();
//			servicos.add(servico1);
//			servicos.add(servico2);
//
//			// Criando objeto Agendamento e definindo os valores
//			Agendamento agendamento = new Agendamento();
//			agendamento.setVeiculos(veiculos);
//			agendamento.setServicos(servicos);
//			agendamento.setFuncionarios(new ArrayList<>()); // Lista vazia
//			agendamento.setPreco(150L);
//			agendamento.setDataEntrada(new Date());
//			agendamento.setDataSaida(new Date());


			// Criando objetos fictícios para serviços
			Servico servico1 = new Servico();
			servico1.setNome("Lavagem");
			servico1.setPreco(50L);
			servico1.setDescricao("Lavagem externa e interna do veículo");
			servico1.setDuracao("1 hora");
			servico1.setAvaliacao(4L);

			servicoRepository.save(servico1);
		};
	}



}
