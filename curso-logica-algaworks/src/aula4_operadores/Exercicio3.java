package aula4_operadores;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/* Faça um programa que receba:
			O valor da conta de luz
			Conta de água
			Conta de telefone
			Escola do filho
			Fatura do cartão
			Gastos com supermercado
			... e mostre o gasto total que a família teve no mês. Não esqueça de usar 
			muito o operador "+=".
		 */
		
		double valorTotal = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o valor da conta de luz: ");
		valorTotal+=scanner.nextDouble();
		System.out.print("Informe o valor da conta de água: ");
		valorTotal+=scanner.nextDouble();
		System.out.print("Informe o valor da conta de telefone: ");
		valorTotal+=scanner.nextDouble();
		System.out.print("Informe o valor da escola do filho: ");
		valorTotal+=scanner.nextDouble();
		System.out.print("Informe o valor da fatura do cartão: ");
		valorTotal+=scanner.nextDouble();
		System.out.print("Informe o valor dos gastos com supermercado: ");
		valorTotal+=scanner.nextDouble();
		System.out.println("O gasto familiar é de: R$ "+valorTotal);
		scanner.close();

	}

}
