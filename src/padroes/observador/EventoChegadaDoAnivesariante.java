package padroes.observador;

import java.util.Date;

public class EventoChegadaDoAnivesariante {

	private final Date moment;

	public EventoChegadaDoAnivesariante(Date moment) {
		this.moment = moment;
	}

	public Date getMoment() { 
		return moment;
	}
	
	
	
}
