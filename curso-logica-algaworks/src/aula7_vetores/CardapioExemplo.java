package aula7_vetores;

import java.util.Scanner;

public class CardapioExemplo {

	public static void main(String[] args) {

		String[] cardapio = new String[] { "Calabresa", "Atum", "Queijo", "Presunto" };
		cardapio[0] = "Frango";
		System.out.println("Escolha o sabor da sua pizza:");
		for (int i = 0; i < cardapio.length; i++) {
			System.out.println("[" + i + "]" + cardapio[i]);

		}
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o número referente ao sabor: ");
		int sabor = scanner.nextInt();
		scanner.close();
		System.out.println("O sabor escolhido da pizza foi: " + cardapio[sabor]);

	}
}