package oo.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Tommy", - 30);  
		p1.setIdade(230);						// alterar
		 
		System.out.println(p1.getIdade());		// Ler
		System.out.println();
		System.out.println(p1); 				// toString
		
	}

}
