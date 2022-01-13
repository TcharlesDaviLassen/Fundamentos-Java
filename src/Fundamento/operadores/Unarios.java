package Fundamento.operadores;

public class Unarios {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1  // Modelo pre fixadp = a++
		a--; // a = a - 1
		
		++b; // b = b + 2 
		--b; // b = b - 2   // Modelo pos fixado = --b 
		
		
		// ++a mais pressa de execusão a-- menos pressa 
		
		
		System.out.println(a);
		System.out.println(b);
		
	 System.out.println("Mini desafiu...");
	 System.out.println(++a == b--);
	 System.out.println(a == b);
	 System.out.println(a);
	 System.out.println(b);
	 
	}
}
