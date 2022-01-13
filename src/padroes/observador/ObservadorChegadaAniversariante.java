package padroes.observador;


@FunctionalInterface
//Pode ser interpretado como Interface que tem um só parametro e retorna a void
public interface ObservadorChegadaAniversariante {
	
	public void chegou(EventoChegadaDoAnivesariante evento);

}
