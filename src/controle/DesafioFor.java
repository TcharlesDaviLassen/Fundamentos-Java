package controle;

public class DesafioFor {
	public static void main(String[] args) {
		
//		double conversão = 5;
//		 
//		String valor = "#";
//		for(int i = 1; i <= conversão; i++) {
//			System.out.println(valor);
//			valor += "#";
		
		
		// Versão do desafio
		// Não pode usar valor numérico pra controlar o laço!
		
		for(String v = "#"; !v.equals("######"); v +="#") {
			System.out.println(v);
		}
	}

}
