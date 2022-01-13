package Lambdas;

public class CalculoTeste2 {
	
	public static void main(String[] args) {
		
		Calculo calc = (x, y) -> { return x + y; };// Se você colocou de forma explícita o par de chaves você precisa chamar o Return
		System.out.println(calc.executar(2, 3));
		
		calc = (x, y) -> x * y; // Forma implicita
		System.out.println(calc.executar(2, 3));
		
		System.out.println(calc.legal());
		System.out.println(Calculo.muitoLegal());
	}

}
