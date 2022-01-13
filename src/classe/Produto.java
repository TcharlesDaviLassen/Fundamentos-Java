package classe;

public class Produto {// nome da clas se e o nome do contrutor são iguais.
	
	String nome; // Atributo e atribu to objeto
	double preco;
	static double desconto = 0.25;
	
	Produto(){ //Produto contrutor, Construtor Produto.
		
	}
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		
		 
	}
	double PrecoComDesconto() {
		return preco * (1 - desconto);
	
	}
	double PrecoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
	
}
