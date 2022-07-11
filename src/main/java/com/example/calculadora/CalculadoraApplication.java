package com.example.calculadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.util.Map;

@SpringBootApplication
public class CalculadoraApplication {

	private static Map< String, Double > impostoPorEstado =
			Map.of("SP",1.0685d,
					"MG", 1.08d,
					"RS", 1.0625d,
					"RJ", 1.04d,
					"AL", 1.0825d );

	//VM arguments quantidade, preco, estado
	public static void main(String[] args) {
		SpringApplication.run(CalculadoraApplication.class, args);
//		String value = JOptionPane.showInputDialog("Digite o CPF ou CNPJ", "");
		int qtdItens = Integer.valueOf(args[0]);
		Double preco = Double.valueOf(args[1]);
		String estado = args[2];
		Double valorBruto = qtdItens * preco;
		double valorComImposto = calcularImposto( estado , valorBruto );
		System.out.println( estado + " - " + valorComImposto);
	}

	public static double calcularImposto( String estado, double valorBruto ){
		Double aliquota = impostoPorEstado.get(estado);
		return valorBruto * aliquota;
	}

}
