package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
	
	// Tranformando o contrutor em privado, se caso for est�nciado uma nova classe do tipo utilit�rio n�o precisa estanciar, j� que tudo � est�tico e privado 
	private Utilitarios(){
	}
	
	public final static UnaryOperator<String> maiuscula = 
			n -> n.toUpperCase();
	
	public final static UnaryOperator<String> primeiraLetra =
			n -> n.charAt(0) + "";// Concatenando uma String vazia "" vai gerar apenas o promeiro caractere da palavra passada como par�metro
	
		public static String grito(String n) {
			return n + "!!!"; // Tirar o Final pq n�o combina com Interface
		}

}
