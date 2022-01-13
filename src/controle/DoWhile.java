package controle;
import java.util.Scanner;
public class DoWhile {

//	if(...) sentença; ou o bloco de codigo definido por par de chaves {}
//	while(...) sentença; ou {}
//  for (inicialização da variavel; Expressão; e a alteração da variavel) sentença; ou {}
	
//  do sentença {}; ou {} while (...); // doWhile é a unica sentença que temina com ponto e virgula ;
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String texto = "";
		
		do {
			System.out.println("Você precisa falar"
					+ "\nas palavras magicas...");
			System.out.print("Quer sair? ");
			texto = entrada.nextLine(); 
		} while (!texto.equalsIgnoreCase("por favor"));

		System.out.println("Obrigado");
		entrada.close();
	}
}
