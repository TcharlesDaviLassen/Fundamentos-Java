package controle.ExerciciosDeEstruturas;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
	/**
	 * 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene
	 * um número aleatório em uma variável. O Jogador tem 10 tentativas para
	 * adivinhar o número gerado. Ao final de cada tentativa, imprima a quantidade
	 * de tentativas restantes, e imprima se o número inserido é maior ou menor do
	 * que o número armazenado.
	 */
 
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	int continuar;
	int numeroSortiado;
	int tentativas;
	int numero;
	
	do {
		System.out.println("Sorteando um número entre 0 e 100 \n");
		Random numeroAleatorio = new Random();
		numeroSortiado = numeroAleatorio.nextInt(101);
		
		System.out.println("Começou o jogo! Sera que consegue me vencer?");
		tentativas = 0;
		
		do {
			tentativas++;
			System.out.printf("Tentativas %d: ", tentativas);
			numero = scanner.nextInt();
			
			if(numero > numeroSortiado) {
				System.out.printf("\nO número sortiado e menor que %d\n\n", numero);
			} else  {
				System.out.printf("\n Parabéns ! Você acortou o número em %d tentativas!\n\n", tentativas);
			}
			
			} while(numero != numeroSortiado);
			System.out.println("Digite 0 para sair, ou qualquer outro número para continuar: ");
			continuar = scanner.nextInt();
			
		} while (continuar != 0);
		
	scanner.close();
	
	}
}