package aula11_utilizando_codigo_de_outros_programadores;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.mail.EmailException;

public class Exercicio1 {
	/*
	 * Crie um programa que faça o mesmo que o exercício 1 do capítulo 10, mas, ao
	 * invés de salvar as atividades no arquivo, envie as atividades por e-mail.
	 * Uma dica aqui na hora do envio da lista de tarefas por e-mail é colocar cada
	 * tarefa em uma linha. Você pode fazer isso utilizando utilizando o código que
	 * diz onde a linha termina. Esse código é o "\n".
	 * Toda vez que o código "\n" é encontrado em uma *string* é feita uma quebra de
	 * linha na hora de apresentar a informação.
	 * Supondo que você tem uma lista com algumas tarefas, você pode fazer assim:
	 */

	public static void main(String[] args) throws EmailException {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> linhas = new ArrayList<>();
		String nomeTarefa;
		int i = 1;
		while (true) {
			System.out.print("Informe tarefa " + i + " :");
			nomeTarefa = scanner.nextLine();
			if ("x".equals(nomeTarefa)) {
				break;
			} else {
				linhas.add(nomeTarefa);
				i++;
			}

		}
		scanner.close();
		
		System.out.println(linhas);

		Carteiro.enviar("@gmail.com", "Lista de tarefas", 
				"Lista de tarefas: \n"+linhas);
		System.out.println("Fim!");
	}

}
