package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		// Offer e Add -> adicionam elementos na fila
		// Diferença é o comportamento quando a fila está cheia!
		
		fila.add("Ana"); // retorna a false
		fila.offer("Bia"); // Lança uma exeção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element -> obter o proximo elemento da fila ( sem remover )
		
		// Diferença é o comportamento quando a fila está vazia!
		
		System.out.println(fila.peek()); // retorna a null
		System.out.println(fila.element()); // Lança uma exeção
		
		// fila.clear(); // limpa a fila
		// fila. isEmpty // saber se a fila está vazia
		//  fila.contains 
		
		// Poll e Remove -> obter o próximo elemento da fila e remove!
		
		System.out.println(fila.poll()); // que ele vai pega o primeiro elemento da fila e já removendo
		System.out.println(fila.remove()); // joga uma exeção quando não a mais ninguém na fila
		
		
		
	}

}
