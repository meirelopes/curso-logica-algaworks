package aula4_operadores;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/* Crie um programa que receba a idade de uma pessoa e a quantidade de tempo que 
		   essa pessoa contribuiu com a previdência, depois verifique se ela pode 
		   aposentar ou não. Nas regras desse programa a pessoa vai precisar ter, pelo 
		   menos, 55 anos e ter contribuído com, pelo menos, 25 anos. Se ela passar nessas 
		   duas condições, então mostre pra ela uma mensagem dizendo que ela pode 
		   aposentar.
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe sua idade: ");
		int idade = scanner.nextInt();
		System.out.print("Informe o seu tempo de contribuição: ");
		int tempoDeContribuicao = scanner.nextInt();
		if(idade>=55 && tempoDeContribuicao>=25) {
			System.out.println("Já pode dar entrada em sua aposentadoria!");
		}else {
			System.out.println("Infelizmente ainda não cumpriu os requisitos para dar entrada em sua aposentadoria!");
		}
		scanner.close();

	}

}
