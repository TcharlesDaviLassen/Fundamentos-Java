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
		System.out.println("N�o sei nada"); 
		
		
		//Expressao - express�o a ser comparada com cada case declarado dentro do switch.
		// Caso o valor obtido na express�o seja
		// a igual ao que for declarado no case, o bloco de c�digo � executado.
	
 //Case - valor que ser� comparado � express�o.
		
		//Break - palavra reservada que finaliza a execu��o do switch. 
		//Caso n�o especificada no final do bloco de c�digo em execu��o,
		//as linhas dos blocos de c�digo seguintes tamb�m ser�o executadas.
		
//default - � a palavra reservada que define o bloco de c�digo a ser executado
// se nenhum dos cases atenderem � express�o declarada .
		
		//o uso do break n�o � necess�rio?

//Neste exemplo demonstramos que o uso do break n�o � necess�rio
// por�m ao n�o declar�-lo e a depender da l�gica de neg�cio, 
//um erro pode ser inserido no projeto.
	
		// Mais no SITE https://www.devmedia.com.br/javascript-switch/41016

		
	}
	

	}
}