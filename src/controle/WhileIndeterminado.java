package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.print("Voc� diz: ");
			valor = entrada.nextLine();
		}
		entrada.close();
		// Nessa etrutura de controle atriubui se a uma quantia
		// indeterminada de vezes, emquanto a palavra atribuida n�o for digitada ela ira se repetindo,nesse caso � sair
	}
}
