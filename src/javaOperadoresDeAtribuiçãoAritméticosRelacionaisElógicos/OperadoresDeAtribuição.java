package javaOperadoresDeAtribui��oAritm�ticosRelacionaisEl�gicos;

import java.util.Scanner;

public class OperadoresDeAtribui��o {

	public static void main(String[] args) {

		//O operador de atribui��o � utilizado para definir o valor inicial ou sobrescrever o valor de uma vari�vel. 
		//o operando � esquerda representa a vari�vel para qual desejamos atribuir o valor informado � direita.
		
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
