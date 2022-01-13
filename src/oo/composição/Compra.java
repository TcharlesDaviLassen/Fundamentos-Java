package oo.composi��o;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(String nome, int quantidade, double pre�o) {
		this.adicionarItem(new Item(nome, quantidade, pre�o));
	}
	
	void adicionarItem(Item item) {
		this.itens.add(item);
		item.compra = this;
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.quantidade * item.pre�o;
		}
		
		return total;
	}
	
}
