package aula3_variaveis_e_constantes;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Crie um programa que vai receber do usuário o valor do produto e a quantidade
		 * do produto que se deseja. Com essas informações encontre o subtotal que será
		 * o valor do produto multiplicado pela quantidade. Depois você vai precisar
		 * usar uma estrutura de decisão. Se a quantidade desejada do produto for maior
		 * que 10 unidades, vai ser preciso dar um desconto de 10% em cima do subtotal,
		 * mas se for menor que 10, você NÃO aplica desconto algum. Para encontrar o
		 * valor referente ao percentual de desconto (que vai ser 0% ou 10%, dependendo
		 * da quantidade) você multiplica o subtotal pelo próprio percentual e divide
		 * tudo por 100. Tendo o valor referente ao percentual de desconto, você vai
		 * retirar esse valor do subtotal. O que sobrar será o valor total final e
		 * deverá ser apresentado no console.
		 */

		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o valor do produto: ");
		double valor = teclado.nextDouble();
		System.out.print("Informe a quantidade do produto: ");
		int quantidade = teclado.nextInt();
		double subtotal = quantidade * valor;
		if (quantidade > 10) {
			double desconto = subtotal * 0.9;
			System.out.println("Desconto aplicado de 10%.");
			System.out.println("Valor total a ser pago: " + desconto);
		} else {
			System.out.println("Valor total a ser pago: " + subtotal);
		}
		teclado.close();

	}

}
