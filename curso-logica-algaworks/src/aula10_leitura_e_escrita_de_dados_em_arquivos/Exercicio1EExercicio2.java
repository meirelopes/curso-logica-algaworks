package aula10_leitura_e_escrita_de_dados_em_arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1EExercicio2 {
	/* 
	 * Exercício 1
	 * Crie um programa que vai receber, através do console, uma lista de atividades
	 * que vai ajudar o usuário a planejar suas tarefas para o dia seguinte.
	 * Depois que o usuário informar, uma a uma, suas tarefas, as mesmas serão
	 * salvas em um arquivo de texto - cada tarefa vai ocupar uma linha desse
	 * arquivo.
	 * Para receber cada tarefa do usuário, use o laço while. Enquanto o usuário não
	 * digitar um "x" no console, continue pedindo que ele informe as atividades. 
	 * Exercício 2
	 * Crie um programa que imprima, no console, a lista de tarefas que você criou com o 
	 * algoritmo da aula passada.
	 */

	public static void main(String[] args) throws IOException {
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
		Path arquivo = Paths
				.get("D:\\Doc_Meire Lopes\\Desktop\\NOVOS DOWLOADS\\Arquivo_texto.txt");

		Files.write(arquivo, linhas);

		System.out.println("FIM");

	}

}
