package controle;

public class DesafioFor {
	public static void main(String[] args) {
		
//		double convers�o = 5;
//		 
//		String valor = "#";
//		for(int i = 1; i <= convers�o; i++) {
//			System.out.println(valor);
//			valor += "#";
		
		
		// Vers�o do desafio
		// N�o pode usar valor num�rico pra controlar o la�o!
		
		for(String v = "#"; !v.equals("######"); v +="#") {
			System.out.println(v);
		}
	}

}
