package aula9_programacao_orientada_a_objetos_exercicio2;

public class Main {

	public static void main(String[] args) {
		/*
		 * Faça exatamente como no exercício passado, só que agora torne o método, que 
		 * verifica a necessidade de repor estoque, como um método de instância. Lembre-se 
		 * de que ele não precisará mais receber parâmetros, pois, usará as próprias 
		 * variáveis de instância da classe Produto.
		 */
		
		Produto produto1 = new Produto();
		produto1.nome = "Celular";
		produto1.quantidadeEstoque = 5;
		System.out.println(produto1.verificarEstoque());
		

	}

}
