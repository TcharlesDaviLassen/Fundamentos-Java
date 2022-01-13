package classe;


public class DesafiuMembrosDeClassevsInstância {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("notebook", 4356.90);
	
		var p2 = new Produto("Tv", 3000);
	
		var p3 = new Produto("piscina", 2500);
		
		Produto.desconto = 0.50;
		
		
		System.out.println(p1.nome + " " + p1.PrecoComDesconto());
		System.out.println(p2.nome + " " + p2.PrecoComDesconto());
		System.out.println(p3.nome + " " + p3.PrecoComDesconto());
		
		double precoFinal1 = p1.PrecoComDesconto();
		double precoFinal2 = p2.PrecoComDesconto();
		double precoFinal3 = p3.PrecoComDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2 + precoFinal3) / 3;
		
		System.out.printf("Média do carrinho = R$%.2f.", + mediaCarrinho);
		
	
}


}