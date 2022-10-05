package programacao_orientada_a_objetos_exercicio2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Pedido pedido1 = new Pedido(01, 130, 20);
		 
		 System.out.println("PEDIDO "+pedido1.getCodigo()+":");
		 System.out.println("Subtotal: "+pedido1.getSubtotal());
		 System.out.println("Desconto: "+pedido1.getDesconto());
		 System.out.println("Total: "+pedido1.getTotal());

		
		

	}

}
