package com.example.smartwashjava;

import com.example.smartwashjava.model.*;
import com.example.smartwashjava.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
	CommandLineRunner initDatabase(ServicoRepository servicoRepository, VeiculoRepository veiculoRepository,
								   UsuarioRepository usuarioRepository, FuncionarioRepository funcionarioRepository,
								   AgendamentoRepository agendamentoRepository, ClienteRepository clienteRepository) {
		return args -> {
			servicoRepository.deleteAll();
			veiculoRepository.deleteAll();
			usuarioRepository.deleteAll();
			funcionarioRepository.deleteAll();
			agendamentoRepository.deleteAll();
			clienteRepository.deleteAll();

			// Criando objetos fictícios para veículos
			Veiculo veiculo1 = new Veiculo();
			veiculo1.setModelo("Gol");
			veiculo1.setMarca("Volkswagen");
			veiculo1.setAno("2020");
			veiculo1.setPlaca("ABC123");
			veiculo1.setCarroceria("Hatchback");
			veiculoRepository.save(veiculo1);

			Veiculo veiculo2 = new Veiculo();
			veiculo2.setModelo("Civic");
			veiculo2.setMarca("Honda");
			veiculo2.setAno("2019");
			veiculo2.setPlaca("XYZ789");
			veiculo2.setCarroceria("Sedan");
			veiculoRepository.save(veiculo2);

			Veiculo veiculo3 = new Veiculo();
			veiculo3.setModelo("Uno");
			veiculo3.setMarca("Fiat");
			veiculo3.setAno("2019");
			veiculo3.setPlaca("XYZ789");
			veiculo3.setCarroceria("Hatchback");
			veiculoRepository.save(veiculo3);

			Veiculo veiculo4 = new Veiculo();
			veiculo4.setModelo("Gtr");
			veiculo4.setMarca("Nissan");
			veiculo4.setAno("2002");
			veiculo4.setPlaca("XY5489");
			veiculo4.setCarroceria("Sedan");
			veiculoRepository.save(veiculo4);

			// Criando objetos fictícios para serviços
			Servico servico1 = new Servico();
			servico1.setNome("Lavagem");
			servico1.setPreco(50L);
			servico1.setDescricao("Lavagem externa e interna do veículo");
			servico1.setDuracao("60");
			servico1.setAvaliacao(4L);
			servicoRepository.save(servico1);

			Servico servico2 = new Servico();
			servico2.setNome("Polimento");
			servico2.setPreco(100L);
			servico2.setDescricao("Polimento da pintura do veículo");
			servico2.setDuracao("40");
			servico2.setAvaliacao(5L);
			servicoRepository.save(servico2);

			Servico servico3 = new Servico();
			servico3.setNome("Troca de óleo");
			servico3.setPreco(80L);
			servico3.setDescricao("Troca de óleo e filtro do veículo");
			servico3.setDuracao("30");
			servico3.setAvaliacao(4L);
			servicoRepository.save(servico3);

			Servico servico4 = new Servico();
			servico4.setNome("Alinhamento e balanceamento");
			servico4.setPreco(120L);
			servico4.setDescricao("Alinhamento e balanceamento das rodas do veículo");
			servico4.setDuracao("45");
			servico4.setAvaliacao(4L);
			servicoRepository.save(servico4);

			Servico servico5 = new Servico();
			servico5.setNome("Revisão completa");
			servico5.setPreco(200L);
			servico5.setDescricao("Revisão completa do veículo, incluindo troca de óleo, filtros, fluidos, etc.");
			servico5.setDuracao("120");
			servico5.setAvaliacao(5L);
			servicoRepository.save(servico5);

			Servico servico6 = new Servico();
			servico6.setNome("Instalação de som automotivo");
			servico6.setPreco(150L);
			servico6.setDescricao("Instalação de sistema de som automotivo no veículo");
			servico6.setDuracao("60");
			servico6.setAvaliacao(4L);
			servicoRepository.save(servico6);


			// Criando lista de veículos e adicionando os objetos criados
//			List<Veiculo> veiculos = new ArrayList<>();
//			veiculos.add(veiculo1);
//			veiculos.add(veiculo2);
//
//			// Criando lista de serviços e adicionando os objetos criados
//			List<Servico> servicos = new ArrayList<>();
//			servicos.add(servico1);
//			servicos.add(servico2);

			// Criando objeto Agendamento e definindo os valores
//			Agendamento agendamento = new Agendamento();
//			agendamento.setVeiculos(veiculos);
//			agendamento.setServicos(servicos);
//			agendamento.setFuncionarios(new ArrayList<>()); // Lista vazia
//			agendamento.setPreco(150L);
//			agendamento.setDataEntrada(new Date());
//			agendamento.setDataSaida(new Date());
//			agendamentoRepository.save(agendamento);

		};
	}



}
