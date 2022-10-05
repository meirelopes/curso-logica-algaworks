package aula3_variaveis_e_constantes;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		/*
		 * Crie um programa que lê, do console, o nome e o sobrenome de uma pessoa e
		 * depois imprime o nome completo. Para isso, você vai precisar de duas
		 * variáveis: a primeira você pode chamar de "nome" e a segunda de "sobrenome".
		 * Por último, você vai juntar o nome e o sobrenome em uma única impressão.
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o seu nome: ");
		String nome = teclado.nextLine();
		System.out.print("Informe o seu sobrenome: ");
		String sobrenome = teclado.nextLine();
		System.out.println("O seu nome completo é: " + nome + " " + sobrenome);
		teclado.close();

	}

}
