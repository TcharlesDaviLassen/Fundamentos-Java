package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	
	public static void main(String[] args) {
		
	Consumer<String> print = System.out::print;
	
	List<String > marcas = Arrays.asList("BMW ", "Audi ", "Honda " );
	marcas.stream().map(m -> m.toUpperCase()).forEach(print);
			
			
	//UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";// Concatenando uma String vazia "" vai gerar apenas o promeiro caractere da palavra passada como parâmetro
	//UnaryOperator<String> grito = n -> n + "!!!";
	
	//System.out.println(maiuscula.andThen(primeiraLetra).andThen(grito).apply("BMW"));
	
	// Usando Streams
	System.out.println("\nUsando composição...");
	marcas.stream()
	.map(Utilitarios.maiuscula)
	.map(primeiraLetra)
	.map(Utilitarios::grito) // Usado refência de Metodo
	.forEach(print);
	
	
	}

}
