package Lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	
	public static void main(String[] args) {
		
		
		/*
		 * 1. A parti do produto calcular o preço real (com desconto)
		 * 2. Imposto municipal: >= 2500 (8,5% / < 2500 (isento)
		 * 3. Frete: >= 3000 (100) /<= 3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. formatar: R$ 1234,56
		*/
		
		
		Function<Produto, Double> precoFinal  =  
				produto -> produto.preco * (1 - produto.desconto);	// Colocar null quando aparce conflino de sintaxe na expressão 			
		UnaryOperator<Double> impostoMunicipal =
				preco -> preco >= 2500 ? preco * 1.085 : preco; // ? = Significa que pego o valor e : = Caso contrario retorna ao valor
		UnaryOperator<Double> frete =
				preco -> preco >= 3000 ? preco + 100 : preco + 50;// Esse simbolo '->' le como Se, aqui no caso, SE preço for
		UnaryOperator<Double> arredondar =
				preco -> Double.parseDouble(String.format("%2f", preco));
		Function<Double, String> formatar = 
				preco -> ("R$" + preco).replace(".", ",");
		
		Produto p = new Produto("Ipad", 3235.89, 0.13);
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar) // Problema no arredondamento executar debug
				.andThen(formatar)
				.apply(p);
		System.out.println("O valor em R$ é " + preco);
		
		
		
	}



}

