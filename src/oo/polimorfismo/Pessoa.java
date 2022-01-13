package oo.polimorfismo;

public class Pessoa {

	private double peso;

	public Pessoa(double peso) {
		setPeso(peso);
	}
	
	public void comer(Comida comida) { // utilização da forma Polimorfica dinamica 
		this.peso += comida.getPeso();
	}
//	public void comer(Feijao feijao) {  // utilização da forma Polimorfica estatica 
//		this.peso += feijao.getPeso();
//	}
//	public void comer(Sorvete sorvete) {
//		this.peso += sorvete.getPeso();
//	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;
		}
	}

	
}
