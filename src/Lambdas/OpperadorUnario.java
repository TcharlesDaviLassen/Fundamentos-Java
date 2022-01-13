package Lambdas;

import java.util.function.UnaryOperator;

public class OpperadorUnario {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		// Gera o comando do primeiro ao ultimo
		int resultado1 = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);
		System.out.println(resultado1);
		
		// Gera o comando do ultimo ao primeiro
		int resultado2 = maisDois
				.compose(vezesDois)
				.compose(aoQuadrado)
				.apply(0);
		System.out.println(resultado2);
	}
	
}
