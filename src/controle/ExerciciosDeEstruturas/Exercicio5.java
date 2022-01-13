package controle.ExerciciosDeEstruturas;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		/** 5. Refatorar o exercício 04, utilizando a estrutura switch. */
		
		Scanner scanner = new Scanner(System.in);
		int contadorDeDivisores = 0;
		
		System.out.println("Digite um numero pra verificar se é um numero primo: ");
		int numero = scanner.nextInt();
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;				
			}
			
		}
		switch (contadorDeDivisores) {
		case 0:
			System.out.println("O numero " + numero + " é um numero primo.");
			break;
		default:
			System.out.println("O numero " + numero + " não é um numero primo.");
			break;
		}
		
		scanner.close();
	}

}

