package programacao_orientada_a_objetos_exercicio2;

public class Pedido {
	private int codigo;
	private double subtotal;
	private double desconto;
	
	
	
	public Pedido(int codigo, double subtotal, double desconto) {
		this.codigo = codigo;
		this.subtotal = subtotal;
		this.desconto = desconto;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public double getTotal() {
		double total = this.subtotal - this.desconto;
		return total;
	}
	
	

}
