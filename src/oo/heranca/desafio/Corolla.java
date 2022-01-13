package oo.heranca.desafio;

public class Corolla extends Carro  {
	
	 public Corolla(){
		super(400);
	}

	public Corolla( int velocidadeMaxima){
		super(velocidadeMaxima);
		setDelta(360);
	}
}

	