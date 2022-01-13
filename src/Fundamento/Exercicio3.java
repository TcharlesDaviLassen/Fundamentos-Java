package Fundamento;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual é o seu peso; ");
		double Peso = scanner.nextDouble();
		
		System.out.println("Qual é a sua altura; ");
		double Altura = scanner.nextDouble();
		
		double IMC = Peso / (Altura * Altura);
	
		System.out.println("Taxa do IMC; " + IMC);
		
		
		scanner.close();
		
		
	}


}
