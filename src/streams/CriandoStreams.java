package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	
	public static void main(String[] args) {
		
		
		Consumer<String> print = System.out::print; //Consumer ; Interface funcional que recebe um parametro e não retorna a nada
		Consumer<Integer> println = System.out::println;
		
		Stream<String> langs = Stream.of("Java ", "Lua ","Lua\n");
		langs.forEach(print);// forEach =  para cada
		
		// Streams modelo Arrays
		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n "};
	
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 4).forEach(print); //  Sub Array e tranformado em Stream
	
		// Outra forma de criar Streams usando Collections
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);// Forma paralela, os dados não são processados na sequência
		
		// Stream de forma infinita
		//Stream.generate(()-> "a").forEach(print);
		Stream.iterate(0, n -> n + 1).forEach(println); // Forma ordenada co Seed que é por qual numero é inicializado a execução
	
	}

}
