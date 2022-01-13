package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		// Offer e Add -> adicionam elementos na fila
		// Diferen�a � o comportamento quando a fila est� cheia!
		
		fila.add("Ana"); // retorna a false
		fila.offer("Bia"); // Lan�a uma exe��o
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element -> obter o proximo elemento da fila ( sem remover )
		
		// Diferen�a � o comportamento quando a fila est� vazia!
		
		System.out.println(fila.peek()); // retorna a null
		System.out.println(fila.element()); // Lan�a uma exe��o
		
		// fila.clear(); // limpa a fila
		// fila. isEmpty // saber se a fila est� vazia
		//  fila.contains 
		
		// Poll e Remove -> obter o pr�ximo elemento da fila e remove!
		
		System.out.println(fila.poll()); // que ele vai pega o primeiro elemento da fila e j� removendo
		System.out.println(fila.remove()); // joga uma exe��o quando n�o a mais ningu�m na fila
		
		
		
	}

}
