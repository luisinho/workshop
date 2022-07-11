package com.example.calculadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculadoraApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraApplication.class, args);
		int qtdItens = Integer.valueOf(args[0]);
		Double preco = Double.valueOf(args[1]);
		String estado = args[2];
		Double valorTotal = qtdItens * preco;
		System.out.println("Valor Total: " + valorTotal);
	}

}
