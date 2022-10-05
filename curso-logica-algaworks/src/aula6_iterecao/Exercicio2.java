package aula6_iterecao;

public class Exercicio2 {

	public static void main(String[] args) {
		// Faça o mesmo que você fez para o exercício 1, mas agora faça utilizando o
		// laço "while".

		Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		System.out.println("ITERAÇÃO WHILE");
		System.out.println("Os números divisíveis por 3 são:");
		int i = 0;
		while (i < numeros.length) {
			int x = numeros[i];
			if (x % 3 == 0) {
				System.out.println(x);
			}
			i++;

		}

	}
}