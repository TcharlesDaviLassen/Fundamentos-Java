package jdbc;

public class Aluno {

	int numeroDaLista;
	String nome;
	
	void inserirRegístro(int numList, String n ) {
		numeroDaLista = numList;
		nome = n;
	}
	
	void  exibirInformacao() {  
	     System.out.println (numeroDaLista + "" + nome);  
	  }    
	
	//Teste inserção de Aluno
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		Aluno a2 =  new Aluno();
		
		a1.inserirRegístro(300, "Shelby");
		a2.inserirRegístro(302, "Harvey");
		
		 System.out.println(a1.numeroDaLista + " " + a1.nome);    
		  System.out.println(a2.numeroDaLista + " " + a2.nome);    
		
	}
}
