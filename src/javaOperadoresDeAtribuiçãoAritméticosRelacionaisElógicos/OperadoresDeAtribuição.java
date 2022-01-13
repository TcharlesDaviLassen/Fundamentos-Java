package javaOperadoresDeAtribuiçãoAritméticosRelacionaisElógicos;

import java.util.Scanner;

public class OperadoresDeAtribuição {

	public static void main(String[] args) {

		//O operador de atribuição é utilizado para definir o valor inicial ou sobrescrever o valor de uma variável. 
		//o operando à esquerda representa a variável para qual desejamos atribuir o valor informado à direita.
		
		Scanner entrada = new Scanner(System.in);

		

	int lado = 2;
	float pi = 3.1426F;
	String texto = "DEVMEDIA";
	lado = 3;
	
	System.out.println("Lado: " + lado);
	System.out.println("PI: " + pi);
	System.out.println("texto: " + texto);
	
	entrada.close();
	
	}
}
