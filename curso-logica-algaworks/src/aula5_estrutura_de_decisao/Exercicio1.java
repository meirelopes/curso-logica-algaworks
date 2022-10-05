package aula5_estrutura_de_decisao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Crie um programa que vai receber as notas que uma pessoa tirou nas duas
		 * materias de sua prova. Serão dois parâmetros para receber um para receber a
		 * nota de português e outro para receber as de matemática. A prova, no total,
		 * vale 200 pontos - 100 para cada matéria. A nota mínima total para passar é
		 * igual ou maior que 150. Entretanto, o candidato não pode tirar menos do que
		 * 60 pontos em qualquer uma das duas matérias, ou seja, se tirar 59 em
		 * português e 100 em matemática (totalizando uma nota maior do que o total
		 * necessário que é 150) ele não conseguirá a vaga. No final mostre para o
		 * candidato se ele conseguiu ou não.
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe sua nota de PORTUGUÊS: ");
		double notaDePortugues = scanner.nextDouble();
		System.out.print("Informe sua nota de MATEMÁTICA: ");
		double notaDeMatematica = scanner.nextDouble();
		if (((notaDePortugues + notaDeMatematica) >= 150) && (notaDeMatematica > 60 && notaDePortugues > 60)) {
			System.out.println("APROVADO");
		} else {
			System.out.println("REPROVADO");
		}
		scanner.close();
	}

}
