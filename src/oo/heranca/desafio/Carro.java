package oo.heranca.desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA; // Estipulando uma velocidade 
	int velocidadeAtual;
	private int delta = 5;
	
	protected  Carro(int velocidadeMaxima){ // prodected significa que esse construtor ficará visivel como de forma de herença
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void  acelerar() {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA ) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += getDelta();
		}
	}

	public void frar() {
		if( velocidadeAtual >= 5) {
		velocidadeAtual -=5 ;
		} else {
			velocidadeAtual = 0;
		}
	}
	
	public String toString() {
		return "Velocidade atual é " + velocidadeAtual;
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
}

