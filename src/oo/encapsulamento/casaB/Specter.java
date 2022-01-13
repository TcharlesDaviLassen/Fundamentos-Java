package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Shelby;

public class Specter extends Shelby {
	
	
	void testeAcessos() {
		Shelby gangster = new Shelby();
	
	//	Shelby gangster = new Shelby(); // Estância de herança via composição
	//	System.out.println(gangster.segredoGanster); // Não acessou pois esta em modo de acesso Private que não é transmitido 
	//	System.out.println(fazNaCasa); // Por ter visibilidade pacote só será transmitido por herança se a classe filha estiveer dentro do mesmo pacote
		System.out.println(formaDeEmpreender); // Desse modo se acessa diretamente via herança referente a classe
		System.out.println(gangster.todosSabem);
		
	

	}
}