package oo.composição;

public class Carro {
	
	Motor motor;
	Carro(){
		this.motor = new Motor(this);// dessa forma se te a seguinte expressão -> o carro tem um motor e o motor tem um carro
	}
	
	void acelerar () {
		if(motor.fatorInjecao < 2.5) {
		motor.fatorInjecao += 0.4;
		}
	}

	void frear() {
		if(motor.fatorInjecao > 0.5) {
		motor.fatorInjecao -= 0.4;
		}
	}
	
	void ligar() {
		motor.ligado = true;
	}
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
}
