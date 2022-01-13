package oo.heranca;

// Classe Pai
public class Jogador { //  Contrutor implicito 

public	int vida = 100;
public	int x;
public	int y;
	
	// Para nao ocorrer erro na class deve se chamar o contrutor padrão 
//	Jogador(){
//		this(0, 0);
//	}
	
	// Contrutor explicito que revoga a definição do contrutor padrão implicito
	protected Jogador(int x, int y) {
		this.x = x;
		this.y = y;		
	}
	
	 public boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if (deltaX == 1 && deltaY == 0) { 
			oponente.vida -= 10; //  quantidade de scorre em cada golpe monstro
			return true;
		} else if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10; // quantidade de scorre em cada golpe heroi
			return true;
		} else {
			return false;
		}
	}
	
	 
	 public boolean andar(Direcao direcao) { // direções que as peças se movimentão no tabuleiro
		switch(direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;		
		}
	
		return true;
	}
	
}
