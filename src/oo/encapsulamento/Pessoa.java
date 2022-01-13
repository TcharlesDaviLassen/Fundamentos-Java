package oo.encapsulamento;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	//Getters
	public int getrIdde() { // O metodo que Lê se chama GET
		return idade;
		
	}
	//Setters
	public void setIdade(int novaIdade) { // O metodo que Altera se chama SET
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;  // Se o valor positivo passado entrar nesse intervalo o valor fa idade será implementado  pelo this.idade = novaIdade 
		}
	}
	
	@Override
	public String toString() {
		return "Olá sou o" + getNome()
			+ " e tenho "
			+ "" + getIdade() + " anos";
	}
}
