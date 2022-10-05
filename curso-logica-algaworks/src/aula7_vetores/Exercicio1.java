package aula7_vetores;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Crie um sistema onde o usuário vai cadastrar, utilizando o console, as 5
		 * tarefas mais importantes do dia dele. Armazene cada uma dessas tarefas em um
		 * vetor e, no final, imprima as tarefas novamente.
		 */

		String[] tarefas = new String[4];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < tarefas.length; i++) {
			System.out.print("Informe a tarefa " + "[" + i + "]: ");
			tarefas[i] = scanner.nextLine();

		}
		System.out.println("As suas tarefas do dia são:");
		for (int j = 0; j < tarefas.length; j++) {
			System.out.println("Tarefa " + "[" + j + "]: " + tarefas[j]);

		}

		scanner.close();

	}
}
