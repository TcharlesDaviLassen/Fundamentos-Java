package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	
	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome = 
				p -> System.out.println(p.nome + "!!!");
		
		Produto p1 = new Produto("Caneta", 12.50, 0.15);
		imprimirNome.accept(p1);
		
		Produto p2 = new Produto("Notebook", 1850, 0.15);
		Produto p3 = new Produto("Tablet", 1250, 0.15);
		Produto p4 = new Produto("Arma", 1350, 0.15);
		Produto p5 = new Produto("Munição", 120, 0.15);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5); 
		
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);		
		
	}

}
