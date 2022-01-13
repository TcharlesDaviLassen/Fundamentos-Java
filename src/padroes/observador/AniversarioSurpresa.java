package padroes.observador;

public class AniversarioSurpresa {
	
	public static void main(String[] args) {
		//Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		Namorada namorada = new Namorada();
		porteiro.registrarObservador(namorada);
		
		porteiro.registrarObservador(e ->{
			System.out.println("Surpresa via Lambda");
			System.out.println("Ocorreu em: " + e.getMoment());
		});
		porteiro.monitorar();
		
	}

}
