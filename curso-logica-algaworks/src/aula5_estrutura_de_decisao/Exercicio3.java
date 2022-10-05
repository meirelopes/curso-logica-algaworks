package aula5_estrutura_de_decisao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Crie um programa que vai receber um número que será referente ao dia da
		 * semana (de 1 até 7). Dependendo do número informado você deve imprimir o nome
		 * desse dia. Se o número 1 for informado, então deverá ser impresso "domingo",
		 * se 2, então "segunda-feira" e por ai vai.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Escolha um dia da semana. Digite:");
		System.out.print("1 para Domingo\n2 para Segunda-feira\n3 para Terça-feira"
				+ "\n4 para Quarta-feira\n5 para Quinta-feira\n6 para Sexta-feira" + "\n7 para Sábado\n");
		int diaDaSemana = scanner.nextInt();
		switch (diaDaSemana) {
		case 1:
			System.out.println("O dia escolhido foi Domingo!");
			break;
		case 2:
			System.out.println("O dia escolhido foi Segunda-feira!");
			break;
		case 3:
			System.out.println("O dia escolhido foi Terça-feira!");
			break;
		case 4:
			System.out.println("O dia escolhido foi Quarta-feira!");
			break;
		case 5:
			System.out.println("O dia escolhido foi Quinta-feira!");
			break;
		case 6:
			System.out.println("O dia escolhido foi Sexta-feira!");
			break;
		case 7:
			System.out.println("O dia escolhido foi Sábado!");
			break;

		default:
			System.err.println("Digite um valor válido!");
			System.exit(1);
			break;
		}
		scanner.close();

	}

}
