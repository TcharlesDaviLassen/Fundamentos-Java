package Fundamento.operadores;

public class DesafioLogico {
	
	public static void main(String[] args) {
		
		// Trabalho na Terça (V ou  F)
		// Trabalho na Quinta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		// Operador Unário
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou Tv 50\"?" + comprouTv50);
		System.out.println("Comprou Tv 32\"?" + comprouTv32);
		System.out.println("Comprou Tv 32\"Sorvete?" + comprouSorvete);
		
		System.out.println("Mais saudável?" + maisSaudavel);
		
		
		
		
	}

}
