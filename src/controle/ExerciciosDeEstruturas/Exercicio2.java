package controle.ExerciciosDeEstruturas;

import java.util.Scanner;

public class Exercicio2 {

	// Criar um programa informa se o ano atual e�? um ano bissexto; 

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o ano: ");
		int ano = entrada.nextInt();
		
		int bissexto = ano % 4;
	
		if(bissexto == 0) {
			System.out.println(ano + " É um ano bissexto!!! ");
		}else  {
			System.out.println(ano + " Não é um ano bissexto!!! ");
		}
		entrada.close();
		}
	}


		
	

