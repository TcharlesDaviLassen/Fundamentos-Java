package javaOperadoresDeAtribuiçãoAritméticosRelacionaisElógicos;

public class OperadoresDeIncrementoeDecremento {

	//Os operadores de incremento e decremento também são bastante utilizados.
	// Basicamente temos dois deles:++ e --
	//os quais podem ser declarados antes ou depois da variável e incrementam ou decrementam em 1 o valor da variável.
	
	public static void main(String[] args) {
		
		int numero = 5;
		numero++;
		numero--;
		System.out.println("Número = " + numero);
		//numero continuará sendo 5.
		
		//Quando declaramos esse operador antes da variável, o incremento é realizado antes do valor da variável ser lido 
		//para o processamento ao qual a instrução pertence. 
		//Quando declarado depois, ocorre o contrário: lê-se o valor da variável 
		//para processamento e só então o valor da variável é incrementado. 
		
		int desafioUm = 5;
		System.out.println(desafioUm  += ++desafioUm);

		int desafioDois = 5;
		System.out.println(desafioDois  += desafioDois++);
		
		//No primeiro println(), desafioUm é incrementado antes de seu valor ser lido para compor a instrução de soma. 
		//Sendo assim, temos desafioUm = 5 + 6. Já no segundo println(), primeiro o valor é lido, resultando em desafioDois = 5 + 5.
		// Somente após a leitura desafioDois é incrementado, e depois, recebe o valor da soma, tendo seu valor sobrescrito com o número 10.
		
		
	}
	
}
