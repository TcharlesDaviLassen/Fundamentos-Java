package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac + n ;
		
		Integer total1 = nums.stream().reduce(soma).get();
		System.out.println(total1);
		
		
		// Alterando a identity do Reduce
		// Se passar o parallelStream, vai acontecer como na parte comentada a baixo
		// Passando o stream vai calcular o resultado a parter da parte inicial
		Integer total2 = nums.stream().reduce(100, soma);// Se caso o valor inicial for 100, cada vez que fizer a chamada ira acomular o valor da chamada, fora o valor somado
		System.out.println(total2);
		
		// Resultado foi um Opcicional<Integer>...
		nums.stream()
		.filter(n -> n >= 8)// Passando um valor maior que 
		.reduce(soma)
		.ifPresent(System.out::println);
	
	}
}
