package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	
	public static void main(String[] args) {
		
		List<Integer> deNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		/*
		 * 1. Número para string binária... 6 = 110
		 * 2. Inverter a string... "110" => "011"
		 * 3. Converterde volta para inteiro =>"011" => 3 
		 */
		
		UnaryOperator<String> inverter = 
				s -> new StringBuilder(s).reverse().toString(); //StringBuilder auxilia na ajudde manipulação quando ha diversas String
		Function<String,Integer> binarioParaInt =
				s -> Integer.parseInt(s, 2);
				
				deNumeros.stream()
				.map(Integer::toBinaryString)
				.map(inverter)
				.map(binarioParaInt)
				.forEach(System.out::println);
		
	}

}
