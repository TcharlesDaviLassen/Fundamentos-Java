package javaOperadoresDeAtribui��oAritm�ticosRelacionaisEl�gicos;

public class OperadoresDeIncrementoeDecremento {

	//Os operadores de incremento e decremento tamb�m s�o bastante utilizados.
	// Basicamente temos dois deles:++ e --
	//os quais podem ser declarados antes ou depois da vari�vel e incrementam ou decrementam em 1 o valor da vari�vel.
	
	public static void main(String[] args) {
		
		int numero = 5;
		numero++;
		numero--;
		System.out.println("N�mero = " + numero);
		//numero continuar� sendo 5.
		
		//Quando declaramos esse operador antes da vari�vel, o incremento � realizado antes do valor da vari�vel ser lido 
		//para o processamento ao qual a instru��o pertence. 
		//Quando declarado depois, ocorre o contr�rio: l�-se o valor da vari�vel 
		//para processamento e s� ent�o o valor da vari�vel � incrementado. 
		
		int desafioUm = 5;
		System.out.println(desafioUm  += ++desafioUm);

		int desafioDois = 5;
		System.out.println(desafioDois  += desafioDois++);
		
		//No primeiro println(), desafioUm � incrementado antes de seu valor ser lido para compor a instru��o de soma. 
		//Sendo assim, temos desafioUm = 5 + 6. J� no segundo println(), primeiro o valor � lido, resultando em desafioDois = 5 + 5.
		// Somente ap�s a leitura desafioDois � incrementado, e depois, recebe o valor da soma, tendo seu valor sobrescrito com o n�mero 10.
		
		
	}
	
}
