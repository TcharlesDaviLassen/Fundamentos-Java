package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Shelby;

public class Specter extends Shelby {
	
	
	void testeAcessos() {
		Shelby gangster = new Shelby();
	
	//	Shelby gangster = new Shelby(); // Est�ncia de heran�a via composi��o
	//	System.out.println(gangster.segredoGanster); // N�o acessou pois esta em modo de acesso Private que n�o � transmitido 
	//	System.out.println(fazNaCasa); // Por ter visibilidade pacote s� ser� transmitido por heran�a se a classe filha estiveer dentro do mesmo pacote
		System.out.println(formaDeEmpreender); // Desse modo se acessa diretamente via heran�a referente a classe
		System.out.println(gangster.todosSabem);
		
	

	}
}