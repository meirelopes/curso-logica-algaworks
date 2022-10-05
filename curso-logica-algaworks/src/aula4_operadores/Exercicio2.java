package aula4_operadores;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/* Crie um programa que receba o valor de um produto e exiba o valor final da 
		   compra. Esse valor final será o valor do produto mais o valor do frete - use o 
		   valor do frete como R$15,00. Uma compra de, por exemplo, R$80,00, teria um valor 
		   final de R$95,00. Agora, caso a compra seja maior ou igual a R$100,00, então 
		   não cobre o frete.
		 */
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o valor do produto: ");
		double valor = teclado.nextDouble();
		final int frete = 15;
		double valorFinal;
		if(valor>=100) {
			valorFinal=valor;
		}else {
			valorFinal=valor+frete;
		}
		System.out.println("O valor final da compra é de: R$ "+valorFinal);
		teclado.close();	}

}
