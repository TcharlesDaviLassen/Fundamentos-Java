package oo.heranca;

public class Heroi extends Jogador {
	
	
	// Metodo usado nas programaçoes da classe
//	boolean atacar(Jogador oponente) {
//		int deltaX = Math.abs(x - oponente.x);
//		int deltaY = Math.abs(y - oponente.y);
//		
//		if (deltaX == 0 && deltaY == 1) {
//			oponente.vida -= 20;
//			return true;
//		} else if(deltaX == 1 && deltaY == 0) {
//			oponente.vida -= 20;
//			return true;
//		} else {
//			return false;
//		}
//	}
//

	// Nova orientaçâo chmado a contrução da classe pai 
	public Heroi(int x, int y) {
		super(x, y);
	}
	
	
	// Metodo de sobre escrita do metodo da classe que haviam sidos criada no ex anterior
 
	@Override
	public boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente); // SUPER é utilizado para chamar um contrutor da classe pai
		return ataque1 || ataque2;					// This já é utilizado para chamar algum contrutor dentro da propia classe

		
	}

}
