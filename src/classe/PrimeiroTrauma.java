package classe;

public class PrimeiroTrauma {
	
	int a = 3; // Não mesxer essa linha
	static int b = 4; // Atributo Int tranformado em STATIC, usando a intância pode se acessar direto a variavel B
	
	public static void main(String[] args) {
		 
		PrimeiroTrauma p = new PrimeiroTrauma();
		System.out.println(p.a);
		
		System.out.println(b);
		
	}

}
