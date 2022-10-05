package aula3_variaveis_e_constantes;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		/*
		 * O seu programa deve receber a nota do aluno pelo console e depois você vai
		 * fazer uma operação lógica para saber se a nota do aluno é maior que 70. O
		 * resultado dessa operação lógica deve ser atribuido a uma variável do tipo
		 * Boolean. Por último, você deve utilizar a variável do tipo Boolean com a
		 * estrutura de decisão if para imprimir, no console, uma mensagem que vai dizer
		 * se o aluno passou ou não passou.
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe sua nota: ");
		double nota = teclado.nextDouble();
		final int notaParaAprovacao = 70;
		Boolean aprovado = nota >= notaParaAprovacao;
		if (aprovado) {
			System.out.println("APROVADO");
		} else {
			System.out.println("REPROVADO");
		}
		teclado.close();

	}
}