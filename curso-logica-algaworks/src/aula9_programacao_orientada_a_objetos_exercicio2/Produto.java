package aula9_programacao_orientada_a_objetos_exercicio2;

public class Produto {
	String nome;
	Integer quantidadeEstoque;
	
	public Boolean verificarEstoque() {
		Boolean quantidadeMinima = this.quantidadeEstoque < 10;
		return quantidadeMinima;


}
}