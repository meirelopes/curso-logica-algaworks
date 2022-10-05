package aula8_metodos;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Crie um programa que peça dois números do usuário e também qual a operação
		 * ele deseja fazer - adição ou subtração. Para cada operação, você deve
		 * construir um método que realize a mesma, ou seja, teremos um método para
		 * adição, que vai receber dois números como parâmetros e retornar o resultado
		 * da soma entre eles, e outro método para subtração.
		 * Fique a vontade para implementar multiplicação e divisão também.
		 */

		String[] operacao = new String[] { "Adição", "Subtração", "Divisão", "Multiplicação" };
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		double numero1 = scanner.nextDouble();
		System.out.print("Digite o segundo número: ");
		double numero2 = scanner.nextDouble();
		System.out.println("Escolha o tipo de operação:");
		for (int i = 0; i < operacao.length; i++) {
			System.out.println("[" + i + "] " + operacao[i]);
		}
		Integer operacaoEscolhida = scanner.nextInt();

		double resultadoFinal = calculadora(operacaoEscolhida, numero1, numero2);
		System.out.println("RESULTADO DA OPERAÇÂO: " + resultadoFinal);
		scanner.close();
	}

	static double calculadora(Integer operacaoEscolhida, double numero1, double numero2) {
		double resultado = 0;
		if (operacaoEscolhida == 0) {
			resultado = somar(numero1, numero2);
		} else if (operacaoEscolhida == 1) {
			resultado = subtrair(numero1, numero2);
		} else if (operacaoEscolhida == 2) {
			resultado = dividir(numero1, numero2);
		} else {
			resultado = multiplicar(numero1, numero2);
		}
		return resultado;
	}

	static double somar(double numero1, double numero2) {
		double soma = numero1 + numero2;
		return soma;
	}

	static double subtrair(double numero1, double numero2) {
		double subtracao = numero1 - numero2;
		return subtracao;
	}

	static double multiplicar(double numero1, double numero2) {
		double multipicacao = numero1 * numero2;
		return multipicacao;
	}

	static double dividir(double numero1, double numero2) {
		double divisao = numero1 / numero2;
		return divisao;
	}

}
