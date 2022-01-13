package controle;

public class SwitchSemBreak {

	//if(bool) ...
	//while(bool) ...
	//for(bool;) ...
	public static void main(String[] args) {
		
	String faixa = "preta";
	
	switch (faixa.toLowerCase()) {
	case "preta":
		System.out.println("Sei o Bassai-Dai");
	case "marron": 
		System.out.println("Sei o Tekki Shodan");
	case "roxa":
		System.out.println("Sei o Heian Godan");
	case "verde":
		System.out.println("Sei o Heian Yodan");
	case "laranja":
		System.out.println("Sei o Heian Sandan");
	case "vermelha":
		System.out.println("Sei o Heian Nidan");
	case"amarela":
		System.out.println("Sei o Heian Shodan");
		break;
	default:
		System.out.println("Não sei nada"); 
		
		
		//Expressao - expressão a ser comparada com cada case declarado dentro do switch.
		// Caso o valor obtido na expressão seja
		// a igual ao que for declarado no case, o bloco de código é executado.
	
 //Case - valor que será comparado à expressão.
		
		//Break - palavra reservada que finaliza a execução do switch. 
		//Caso não especificada no final do bloco de código em execução,
		//as linhas dos blocos de código seguintes também serão executadas.
		
//default - é a palavra reservada que define o bloco de código a ser executado
// se nenhum dos cases atenderem à expressão declarada .
		
		//o uso do break não é necessário?

//Neste exemplo demonstramos que o uso do break não é necessário
// porém ao não declará-lo e a depender da lógica de negócio, 
//um erro pode ser inserido no projeto.
	
		// Mais no SITE https://www.devmedia.com.br/javascript-switch/41016

		
	}
	

	}
}