package Lambdas;

@FunctionalInterface //  N�o permite ter mais que um m�todo int�ciavel, permite ajudar nas fun��es Lambdas
public interface Calculo {
 
	double executar (double a, double b);  
	
	default  String legal() {
		return "Legal";
	}
	
	static String muitoLegal() {
		return"Muito Legal";
		
	}

}
