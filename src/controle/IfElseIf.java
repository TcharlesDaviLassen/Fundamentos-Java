package controle;

import java.util.Scanner;

public class IfElseIf {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a nota : ");  // Print estrutura recomendada para configuração double
		
		double nota  = entrada.nextDouble();	
		
		// Não se pode inicia com else se inicia inicialmente co if 
	
		if 	(nota > 10 || nota < 0 ) {
			System.out.print("Nota inválida! ");
		} else if ( nota >= 8) {
			System.out.print("Conseito A\n"); 
		} else if ( nota >= 6) {
			System.out.print("Conseito B\n"); 
		} else if ( nota >= 4) {
			System.out.print("Conseito C\n");
		} else if ( nota >= 2) {
			System.out.print("Conseito D\n");
		} else {
			System.out.print("Conseito E\n");
		}
		
		if  (nota >=8 && nota <= 10) {
		System.out.print(" Joia Fera !! ");
		}
		entrada.close(); 
		
	}

  

}
