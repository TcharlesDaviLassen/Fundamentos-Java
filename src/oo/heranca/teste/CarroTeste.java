package oo.heranca.teste;

import oo.heranca.desafio.Corolla;
import oo.heranca.desafio.Mustang;
import oo.heranca.desafio.Carro;


public class CarroTeste {
	public static void main(String[] args) {
		
		Carro toyota = new Corolla(300);// Limite de velocidade que o Carro pode chegar após estabelecer o contrutor de forma explicita usando as referencias da classe Carro
		
		toyota.acelerar();
		System.out.println(toyota);
		
		toyota.acelerar();
		System.out.println(toyota);
		
		toyota.acelerar();
		System.out.println(toyota);
		
		toyota.acelerar();
		System.out.println(toyota);
		
		toyota.acelerar();
		System.out.println(toyota);
		
		toyota.acelerar();
		System.out.println(toyota);
		
		//
		
		Mustang mustang = new Mustang(400); // Limite de velocidade que o Carro pode chegar após estabelecer o contrutor de forma explicita da classe estabelecidas na pasta Mustang
		
		mustang.ligarTurbo();
	//	mustang.desligarTurbo();
		
		mustang.acelerar();
		System.out.println(mustang);
	
		mustang.acelerar();
		System.out.println(mustang);
		
	}

}
