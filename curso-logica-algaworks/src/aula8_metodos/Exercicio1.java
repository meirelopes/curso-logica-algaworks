package aula8_metodos;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Veja novamente o algoritmo da aula passada e identifique o outro trecho que
		 * poderia ser reaproveitado através do uso de métodos.
		 */

		Scanner scanner = new Scanner(System.in);
		imprimirTraco();
		String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avançado" };
		System.out.println("Escolha dentre os cursos abaixo: ");

		iterar(cursos);
		System.out.print("O curso que você deseja é o: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();

		validar(posicaoCursoEscolhido, cursos);

		imprimirTraco();

		String[] formasPagamento = new String[] { "Cartão", "Boleto" };

		System.out.println("Escolha dentre as formas de pagamento abaixo: ");

		iterar(formasPagamento);
		System.out.print("Sua forma de pagamento escolhida é: ");
		Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();

		validar(posicaoFormaPagamentoEscolhida, formasPagamento);
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

		imprimirTraco();

		System.out.println(
				"O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + 
		formaPagamentoEscolhida+".");

		scanner.close();
	}

	static void imprimirTraco() {
		System.out.println("----------------------------------------------");
	}

	static void mensagemDeErro() {
		System.err.println("Posição inválida!");
		System.exit(1);

	}

	static void iterar(String vetor[]) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("[" + i + "] " + vetor[i]);
		}
	}

	static void validar(Integer posicao, String[] vetor) {
		Boolean posicaoValida = posicao >= 0 && posicao < vetor.length;
		if (!posicaoValida) {
			mensagemDeErro();
		}

	}

}
