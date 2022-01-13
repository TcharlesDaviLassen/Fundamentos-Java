package oo.composição.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	final List<Item> itens = new ArrayList<>();
	
	void adicionarItem(Produto p, int q) {
		this.itens.add(new Item(p, q));
	}
	
	void adicionarItem(String nome, double preco, int q ) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, q));
	}
	
	double obterValorTotal() {
		double total = 0;
		for(Item item: itens) {
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
	}
	
}
