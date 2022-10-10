package aula11_utilizando_codigo_de_outros_programadores;

import java.util.Scanner;

//import console.Interacao;





public class Exercicio2 {
	/*
	 * Sua tarefa agora é pegar a classe CalcularValorTroco do capítulo 2 e utilizar
	 * a nossa biblioteca AlgaWorksConsole ao invés da classe Scanner diretamente.
	 */
	public static void main(String[] args) {

		double peso;
		double altura;
		
		// Resolver: 
		//Interacao interacao = new Interacao();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o seu peso: ");
		peso = scanner.nextDouble();
		System.out.print("Informe a sua altura: ");
		altura = scanner.nextDouble();
		double multiplicacao = altura * altura;
		double imc = peso / multiplicacao;
		scanner.close();
		System.out.println("O seu IMC é: " + imc);

	}
}
