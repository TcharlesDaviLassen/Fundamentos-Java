package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
	
	// Tranformando o contrutor em privado, se caso for estânciado uma nova classe do tipo utilitário não precisa estanciar, já que tudo é estático e privado 
	private Utilitarios(){
	}
	
	public final static UnaryOperator<String> maiuscula = 
			n -> n.toUpperCase();
	
	public final static UnaryOperator<String> primeiraLetra =
			n -> n.charAt(0) + "";// Concatenando uma String vazia "" vai gerar apenas o promeiro caractere da palavra passada como parâmetro
	
		public static String grito(String n) {
			return n + "!!!"; // Tirar o Final pq não combina com Interface
		}

}
