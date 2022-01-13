package controle;

public class BreakRotulado {
	public static void main(String[] args) {
		
		//externo: excluindo as // dara uma rotulaão ao comando da estrutura e colocar externo no Break no final da estrutura.
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 1) {
					break ; // externo;				
				}
				System.out.printf("[%d %d] ", i, j);
			}
			System.out.println();
		}
		System.out.println("\nFim");
	}

}
