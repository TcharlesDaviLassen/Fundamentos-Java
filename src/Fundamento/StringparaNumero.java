package Fundamento;

import javax.swing.JOptionPane;

public class StringparaNumero {

	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");

		double número1 = Double.parseDouble(valor1);
		double número2 = Double.parseDouble(valor2);
		
		double soma = número1 + número2;
		System.out.println("Soma é " + soma);
		System.out.println("Media é  " + soma / 2);
		 
		
		// BigDecimal import  é encontrado emjava.math.BigDecimal;
		// para encontrar valores mais precisos;
		
	}

}
