package aula4_operadores;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		/*Para criar uma calculadora simples você vai precisar receber três informações 
		  pelo console. São os dois números que participarão da operação e também a 
		  operação que será realizada. Você vai receber o primeiro número, depois vai 
		  receber qual é a operação e, por último, o segundo número. Para os números que 
		  você vai receber pelo console, pode utilizar a mesma funcionalidade que já 
		  utilizamos aqui no curso - o *Scanner*. Para receber a operação você pode receber 
		  também um número que vai indicar a mesma. Por exemplo, o número 1 será adição, 
		  o 2 subtração, o 3 multiplicação e o 4 divisão. Com esses três valores - os dois 
		  números e qual será a operação - você pode utilizar a estrutura de decisão if 
		  para só realizar a operação que o usuário escolheu. Se estiver com dúvidas, 
		  então volte a aula onde falamos sobre alteração do valor de uma variável - aula 3.10.
		 */
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o primeiro número: ");
		double numero1 = teclado.nextDouble();
		System.out.print("Informe o segundo número: ");
		double numero2 = teclado.nextDouble();
		System.out.println("Infome a operação que deseja realizar: ");
		System.out.println("1 - ADIÇÃO\n2 - SUBTRAÇÃO\n3 - MULTIPLICAÇÃO \n4 - DIVISÃO");
		int operacao = teclado.nextInt();
		double resultado;
		if(operacao==1) {
			resultado = numero1+numero2;
		}else if(operacao==2) {
			resultado = numero1-numero2;
		}else if(operacao==3) {
			resultado = numero1*numero2;
		}else {
			resultado =numero1/numero2;
		}
		teclado.close();
		System.out.println("O resultado da operação é: "+resultado);
	}
	

}
