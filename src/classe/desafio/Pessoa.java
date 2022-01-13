package classe.desafio;

public class Pessoa {

	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
		
	}
	
	// Acrecentando a variavel COMER
	void comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.peso;
		}
	}
		
	String apresentar() {
		return "Olá sou o " + nome + " e tenho "  + peso + "kgs";
	}
	
}
