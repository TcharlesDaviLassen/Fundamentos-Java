package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		// Como a class está dentro do mesmo pacote "classe" 
		// não precisa importar o propio JAVA estabelece a função
		
		Produto p1 = new Produto("notebook", 4356.90); // Apartir de ter criado um outro atributo contrutor deve se criar outro parametros.
		//Caso de duvida Aula Construtor#1#2
		//p1.nome = "notebook";
		//p1.preco = 4356.90;
		//p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 12.56;
	
		Produto.desconto = 0.50;
		
		System.out.println(p1.nome + " " + p1.PrecoComDesconto());
		System.out.println(p2.nome + " " + p2.PrecoComDesconto());
		
		double precoFinal1 = p1.PrecoComDesconto();
		double precoFinal2 = p2.PrecoComDesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Média do carrinho = R$%.2f.", + mediaCarrinho);
		
	}
}