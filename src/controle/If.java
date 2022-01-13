package controle;
import java.util.Scanner;
public class If {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();
		
		// JAVA utiliza bloco de codigo com chave
		
		if (media <= 10 && media >=7.0) {
			System.out.println("Aprovado! ");
			System.out.println("Parabéns! ");
		}
		
		 if(media < 4.5 && media>= 4.5)
			 System.out.println("Recuperação ");
		 
		 boolean criterioReprovação =
				 media < 4.5 && media >= 0;
				 
		 if(criterioReprovação);{
		 System.out.println("Reprovado ");
		 }
		
		 entrada.close();
		
		
		//A estrutura condicional if/else permite ao programa avaliar uma expressão 
		//como sendo verdadeira ou falsa e, de acordo com o resultado
		// dessa verificação, executar uma ou outra rotina.		 
		//Na linguagem Java o tipo resultante dessa expressão deve ser sempre um boolean,
		// pois diferentemente das demais, o Java não converte null ou inteiros como 0 e 1 
		//para os valores true ou false.
	
	//Complementar ao if/else temos o operador else if. Esse recurso possibilita adicionar uma nova condição 
	//à estrutura de decisão para atender a lógica sendo implementada.
		 
		 //Podemos utilizar quantos "else if" forem necessários. Entretanto, o else deve ser adicionado apenas uma vez,
		 // como alternativa ao caso de todos os testes terem falhado.
		
	}
	
}
