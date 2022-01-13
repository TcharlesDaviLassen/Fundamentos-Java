package Lambdas;

@FunctionalInterface //  Não permite ter mais que um método intâciavel, permite ajudar nas funções Lambdas
public interface Calculo {
 
	double executar (double a, double b);  
	
	default  String legal() {
		return "Legal";
	}
	
	static String muitoLegal() {
		return"Muito Legal";
		
	}

}
