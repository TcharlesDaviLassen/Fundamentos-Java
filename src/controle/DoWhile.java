package controle;
import java.util.Scanner;
public class DoWhile {

//	if(...) senten�a; ou o bloco de codigo definido por par de chaves {}
//	while(...) senten�a; ou {}
//  for (inicializa��o da variavel; Express�o; e a altera��o da variavel) senten�a; ou {}
	
//  do senten�a {}; ou {} while (...); // doWhile � a unica senten�a que temina com ponto e virgula ;
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String texto = "";
		
		do {
			System.out.println("Voc� precisa falar"
					+ "\nas palavras magicas...");
			System.out.print("Quer sair? ");
			texto = entrada.nextLine(); 
		} while (!texto.equalsIgnoreCase("por favor"));

		System.out.println("Obrigado");
		entrada.close();
	}
}
