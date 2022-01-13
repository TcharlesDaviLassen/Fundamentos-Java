package padroes.observador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



public class Porteiro {
	
	private List<ObservadorChegadaAniversariante> observadores
		= new ArrayList<>();
	
	public void registrarObservador(
			ObservadorChegadaAniversariante observador) {
		observadores.add(observador);
	}
	
	public void monitorar() {
		Scanner entrada =  new Scanner(System.in);
		
		String valor = "";
		
		while(!"Sair".equalsIgnoreCase(valor)) {
			
			System.out.println("Aniversariante chegou?");
			valor = entrada.nextLine();
			
			if("sim" .contentEquals(valor)) {
				// criar o  evento
				EventoChegadaDoAnivesariante evento = 
						new EventoChegadaDoAnivesariante(new Date());
				
				// notificar os observadores!
				observadores.stream()
				.forEach(o -> o.chegou(evento));
			} else {
				System.out.println("Alame falso!");
			} 
		}
		
		entrada.close();
		
	}

}
