package controle;

import javax.swing.JOptionPane;

public class IfELSE {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o n�mero: ");
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0){ 
			System.out.println("N�mero par!");
		}else {
		System.out.println("N�mero impar! ");
		}
		
		// Se por (;) a se��o anterior estar� associada ao q foi escrito
		
	
	}

}
