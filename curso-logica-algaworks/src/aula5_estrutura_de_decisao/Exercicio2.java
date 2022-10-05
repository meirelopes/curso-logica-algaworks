package aula5_estrutura_de_decisao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Pense em uma empresa fictícia que todo o mês de Janeiro premia seus
		 * funcionários com um bônus, caso a meta seja alcançada. Crie um programa que
		 * receba 3 parâmetros. O primeiro será a meta de faturamento anual da empresa
		 * para o ano que passou. Depois, receba o parâmetro referente ao faturamento
		 * real da empresa no ultimo ano. Por último, receba a média salarial do
		 * funcionário(a) para o ano anterior (não precisa fazer cálculo de média
		 * salarial, já que estamos trabalhando com um algoritmo fictício - na hora de
		 * informar esse parâmetro, invente um valor qualquer para representar essa
		 * média salarial). Nessa empresa fictícia, se o faturamento real for igual ou
		 * maior que a meta de faturamento anual, então os funcionários ganharam um
		 * bônus que será igual a média salarial deles no último ano. Caso o faturamento
		 * seja menor que a meta, mas, seja maior ou igual a 80% do valor da meta, então
		 * eles receberão também 80% de sua média salarial. No final, mostre de quanto
		 * será o prêmio desse funcionário(a).
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("INFORME A META DE FATURAMENTO ANUAL DA EMPRESA: ");
		double metaDeFaturamento = scanner.nextDouble();
		System.out.print("INFORME O FATURAMENTO ANUAL DA EMPRESA: ");
		double faturamento = scanner.nextDouble();
		System.out.print("INFORME SUA MÉDIA SALARIAL: ");
		double mediaSalarial = scanner.nextDouble();
		double bonus;
		if (faturamento >= metaDeFaturamento) {
			bonus = mediaSalarial;
			System.out.println("Parabéns! O seu bônus é de R$ " + bonus);
		} else if (faturamento >= (metaDeFaturamento * 0.8)) {
			bonus = mediaSalarial * 0.8;
			System.out.println("Parabéns! O seu bônus é de R$ " + bonus);
		} else {
			System.out.println("Infelizmente você não obteve bônus!");
		}
		scanner.close();

	}

}
