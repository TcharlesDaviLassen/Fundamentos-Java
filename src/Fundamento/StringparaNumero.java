package Fundamento;

import javax.swing.JOptionPane;

public class StringparaNumero {

	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro n�mero:");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo n�mero:");

		double n�mero1 = Double.parseDouble(valor1);
		double n�mero2 = Double.parseDouble(valor2);
		
		double soma = n�mero1 + n�mero2;
		System.out.println("Soma � " + soma);
		System.out.println("Media �  " + soma / 2);
		 
		
		// BigDecimal import  � encontrado emjava.math.BigDecimal;
		// para encontrar valores mais precisos;
		
	}

}
