package aula5_estrutura_de_decisao;

import java.util.Scanner;

public class Exercicio1Codigo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe sua nota de PORTUGUÊS: ");
		double notaDePortugues = scanner.nextDouble();
		System.out.print("Informe sua nota de MATEMÁTICA: ");
		double notaDeMatematica = scanner.nextDouble();
		boolean notaMinimaPortugues = notaDePortugues > 60;
		boolean notaMinimaMatematica = notaDeMatematica > 60;
		boolean notaPortuguesMaisNotaMatematica = (notaDePortugues + notaDeMatematica) >= 150;
		boolean aprovado = notaMinimaMatematica && notaMinimaPortugues && notaPortuguesMaisNotaMatematica;
		if (aprovado) {
			System.out.println("APROVADO");
		} else {
			System.out.println("REPROVADO");
		}

		scanner.close();
	}

}
