package controle;

import java.util.Scanner;

public class DeafioDaSemana {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o número do dia: ");
 
//		double semana = entrada.nextDouble();
		
//		if ( semana < 1 || semana > 7) {
//			System.out.print("Dia da semana invalido ");
//		} 
//		if (semana == 1){
//			System.out.print("Domingo");
//		} else if (semana == 2){
//			System.out.print("Segunda");
//		}else if (semana == 3) {
//			System.out.print("Terça");
//		}else if (semana == 4) {
//			System.out.print("Quarta");
//		}else if(semana ==5) {
//			System.out.print("Quinta");
//		}else if (semana == 6) {
//			System.out.print("Sexta");
//		}else if (semana == 7) {
//			System.out.print("Sábado");
//		}
//		
		String dia = entrada.next();
		
		if("Domingo".equalsIgnoreCase(dia)) {
			System.out.println(1);
		}else if("Segunda".equalsIgnoreCase(dia)) {
			System.out.println(2);
		}else if("Terça".equalsIgnoreCase(dia)) {
			System.out.println(3);
		}else if("Quarta".equalsIgnoreCase(dia)) {
			System.out.println(4);
		}else if("Quinta".equalsIgnoreCase(dia)) {
			System.out.println(5);
		}else if("Sexta".equalsIgnoreCase(dia)) {
			System.out.println(6);
		}else if("Sábado".equalsIgnoreCase(dia)) {
			System.out.println(7);
		}
		
		System.out.print("Dale pia ");
		entrada.close();
		
	}

}
