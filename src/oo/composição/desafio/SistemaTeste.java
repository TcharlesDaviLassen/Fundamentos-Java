package oo.composição.desafio;

public class SistemaTeste {
	
	public static void main(String[] args) {
		
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Arma", 30.000, 10);
		compra1.adicionarItem("Municao", 60.000, 30);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Arma", 30.000, 10);
		compra2.adicionarItem("Municao", 60.000, 30);
		
		Cliente cliente = new Cliente("Tommy Shelby");
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);
		
		System.out.print("O valor total é R$ ");
		System.out.println(cliente.obterValorTotal());
		
	
	}

}
