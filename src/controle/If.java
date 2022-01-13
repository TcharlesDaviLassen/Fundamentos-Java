package controle;
import java.util.Scanner;
public class If {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe a m�dia: ");
		double media = entrada.nextDouble();
		
		// JAVA utiliza bloco de codigo com chave
		
		if (media <= 10 && media >=7.0) {
			System.out.println("Aprovado! ");
			System.out.println("Parab�ns! ");
		}
		
		 if(media < 4.5 && media>= 4.5)
			 System.out.println("Recupera��o ");
		 
		 boolean criterioReprova��o =
				 media < 4.5 && media >= 0;
				 
		 if(criterioReprova��o);{
		 System.out.println("Reprovado ");
		 }
		
		 entrada.close();
		
		
		//A estrutura condicional if/else permite ao programa avaliar uma express�o 
		//como sendo verdadeira ou falsa e, de acordo com o resultado
		// dessa verifica��o, executar uma ou outra rotina.		 
		//Na linguagem Java o tipo resultante dessa express�o deve ser sempre um boolean,
		// pois diferentemente das demais, o Java n�o converte null ou inteiros como 0 e 1 
		//para os valores true ou false.
	
	//Complementar ao if/else temos o operador else if. Esse recurso possibilita adicionar uma nova condi��o 
	//� estrutura de decis�o para atender a l�gica sendo implementada.
		 
		 //Podemos utilizar quantos "else if" forem necess�rios. Entretanto, o else deve ser adicionado apenas uma vez,
		 // como alternativa ao caso de todos os testes terem falhado.
		
	}
	
}
