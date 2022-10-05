package aula9_programacao_orientada_a_objetos_exercicio1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto produto1= new Produto();
		produto1.nome = "Celular";
		produto1.quantidadeEstoque = 15;
		Produto produto2= new Produto();

		produto2.nome = "Celular2";
		produto2.quantidadeEstoque = 9;

		System.out.println(verificarEstoque(produto2));
	}
	
	public static Boolean verificarEstoque(Produto produto) {
		Boolean quantidadeMinima = produto.quantidadeEstoque<10;
		return quantidadeMinima;

	}

}
