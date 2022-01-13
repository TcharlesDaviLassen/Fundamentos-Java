package Lambdas;

import java.util.function.Function;

public class Funcao { // Fun��o conjunta
	
	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar =
				numero -> numero % 2 == 0 ? "Par" : "�mpar";
				
				System.out.println(parOuImpar.apply(30));
				
				
				Function<String, String> oResultadoE = 
						valor -> "O resultado �: " + valor;
						
				Function<String, String> empolgado =
						valor -> valor + "!!";
		
				String resultadoFinal = parOuImpar
								.andThen(oResultadoE)
								.andThen(empolgado)
								.apply(30);
						
				System.out.println(resultadoFinal);
		
	}

}
