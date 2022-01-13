package Fundamento.operadores;

public class Atribuição {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; // = c = c + b;
		
		System.out.println(c);
	}

}
