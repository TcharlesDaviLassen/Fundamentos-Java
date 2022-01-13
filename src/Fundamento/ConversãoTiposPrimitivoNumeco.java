package Fundamento;

public class ConversãoTiposPrimitivoNumeco {

	public static void main(String[] args) {
		
		double a = 1; // implicita
		System.out.println(a);
		float b = (float) 1.123456789999; // explicota (CAST)
		System.out.println(b);

		
		int c = 340;
		byte d = (byte) c; // explicita(CAST)
		System.out.println(d);
		 
		double e = 1.999999;
		int f = (int) e;
		System.out.println(f);
		
		// conversão explícita por exemplo
		//se eventualmente for 30.99999 será 30
		
		// DE PREFERENCIA A USAR // INT
	}
}
