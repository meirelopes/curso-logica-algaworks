package aula2_comecando;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * O índice de massa corporal, mais conhecido pela sigla IMC, é um índice
		 * adotado pela OMS (Organização Mundial de Saúde), que é usado para o
		 * diagnóstico do sobrepeso e da obesidade. O IMC pode ser facilmente calculado
		 * a partir de dois simples dados: peso e altura. A fórmula para o seu cálculo
		 * eu vou passar aqui pra você e sua missão é criar um pequeno programa que faça
		 * esse cálculo automaticamente. Veja aqui a fórmula: IMC = PESO / (ALTURA *
		 * ALTURA) Lembrando que o peso é em quilogramas e a altura é em metros. A
		 * primeira coisa a se fazer é declarar duas variáveis que vão receber o peso e
		 * a altura, respectivamente. Esses dois valores serão informados pelo usuário -
		 * da mesma forma como fizemos na aula anterior. Depois dessas duas variáveis,
		 * vai ser preciso declarar uma terceira que vai guardar o resultado da
		 * multiplicação da altura por ela mesma (é a parte "ALTURA * ALTURA" da fórmula
		 * acima).Agora basta dividir o peso pela multiplicação que foi feita. O
		 * resultado dessa divisão já será o final. Guarde o resultado dessa divisão em
		 * uma quarta variável que será utilizada para exibir para o usuário.
		 */
		double peso;
		double altura;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o seu peso: ");
		peso = scanner.nextDouble();
		System.out.print("Informe a sua altura: ");
		altura = scanner.nextDouble();
		double multiplicacao = altura * altura;
		double imc = peso / multiplicacao;
		scanner.close();
		System.out.println("O seu IMC é: " + imc);

	}

}
