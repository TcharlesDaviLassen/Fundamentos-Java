package Lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		
	List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
	
	System.out.println("Forma tradicional...");
	for(String nome: aprovados) {
		System.out.println(nome);
	}
	
	System.out.println("\nLambdas #1...");
	aprovados.forEach(nome -> System.out.println(nome + "!!!"));
	
	System.out.println("\nMethod Reference #1...");
	aprovados.forEach(System.out::println );// Esses :: dois pontos consecutivos passa uma refefencia de Medotos
	
	System.out.println("\nLambdas #2...");
	aprovados.forEach(nome -> meuImprimir(nome ));
	
	System.out.println("\nMethod Reference #2...");
	aprovados.forEach(Foreach:: meuImprimir);
	
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi! Onome é " + nome);
	}
}

