package oo.heranca;

public class Monstro extends Jogador { // usando a palavra extends se recebe especificações na qual são atribu e heranç 
	
	
	public Monstro(){
		super(0, 0); // Lugar onde será iniciado no tabuleiro 
	}
	
	
	// Outro contrutor que recebe x e y
	
	public Monstro(int x, int y){
		super(x, y); 
	}
	
//	boolean atacar(Jogador oponente) {
//		int deltaX = Math.abs(x - oponente.x);
//		int deltaY = Math.abs(y - oponente.y);
//		
//		if (deltaX == 0 && deltaY == 1) {
//			oponente.vida -= 10;
//			return true;
//		} else if(deltaX == 1 && deltaY == 0) {
//			oponente.vida -= 10;
//			return true;
//		} else {
//			return false;
//		}
//	}
	

}
