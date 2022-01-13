package Fundamento;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		//Ler num.1
		//Lernum.2
		//+ - * % em uma dessas operações
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe o valor númerico!! ");		
		double num1 = entrada.nextDouble();
				
		System.out.println("Informe o valor númerico!! ");		
		double num2 = entrada.nextDouble();
		
		System.out.println("Informe o valor da operação!! ");		
		String op = entrada.next();
		
		
		// Lógica
		
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 :resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f ", 
				num1, op,  num2, resultado);
		
		
		entrada.close();
		
		
	}
}
