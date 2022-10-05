package aula3_variaveis_e_constantes;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Leia um número no console e depois faça o cálculo do quadrado desse número e
		 * exiba o resultado no console. Lembrando que o quadrado de um número é
		 * calculado multiplicando-se o número por ele mesmo. Por exemplo, para
		 * encontrar o quadrado de 2 é preciso multiplicar o 2 por 2, tendo como
		 * resultado o número 4.
		 */
		Scanner teclado = new Scanner(System.in);
		System.out.print("Favor informar um número: ");
		Integer numero = teclado.nextInt();
		double quadrado = numero * numero;
		System.out.println("O quadrado do número é " + quadrado);
		teclado.close();
	}

}
