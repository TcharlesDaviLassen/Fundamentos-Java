package controle;

import javax.swing.JOptionPane;

public class IfELSE {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o número: ");
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0){ 
			System.out.println("Número par!");
		}else {
		System.out.println("Número impar! ");
		}
		
		// Se por (;) a seção anterior estará associada ao q foi escrito
		
	
	}

}
