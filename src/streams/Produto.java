package streams;

public class Produto {


	final String nome;
	final double preco;
	final double deconto;
	final double valorFrete;
	
	public Produto(String nome, double preco, double deconto, double valorFrete) {
		this.nome = nome;
		this.preco = preco;
		this.deconto = deconto;
		this.valorFrete = valorFrete;
	}
}