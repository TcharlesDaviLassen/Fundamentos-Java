package oo.heranca.desafio;

public class Mustang extends Carro implements Esportivo, Luxo {

	private boolean ligarTurbo;
	private boolean ligarAr;
	
 
	public Mustang(){
	super(315);
	
	}

	 public Mustang( int velocidadeMaxima){
		super(velocidadeMaxima);
		setDelta(15);
	} 
	 
	 @Override
	public void ligarTurbo() {
		 ligarTurbo = true;
		// setDelta(35);;
	}
	 
	 @Override
	public void desligarTurbo() {
		 ligarTurbo = false;
		// setDelta(15);;
	}
	 
	@Override
	public void ligarAr() {
		ligarAr = true;
		
	}
	
	@Override
	public void desligarAr() {		
		ligarAr = false;
	}
	@Override
	public  int  getDelta() {
	if(ligarTurbo && !ligarAr) {
		return 35;
	} else if (ligarTurbo && ligarAr) {
		return 30;
	} else if(!ligarTurbo && !ligarAr) {
		return 20;
	} else {
		return 15;
		}
	}
	
//
//	@Override // Quando se sobre escreve o metodo deve mater igual ou aumentar a visibilidade
//	void acelerar() {
//	velocidadeAtual += 15;
//	}

}

