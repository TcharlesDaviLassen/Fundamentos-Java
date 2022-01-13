package Lambdas;

public class CalculoTeste1 {
	
	public static void main(String[] args) {
		
		Calculo calculo = new Soma();
		System.out.println(calculo.executar(2, 3) );
		
		calculo = new Multiplicar(); // Como as duas classes implementam a interface consegue se usar polimorfismo
		System.out.println(calculo.executar(2, 3));
		
	
	}

}
