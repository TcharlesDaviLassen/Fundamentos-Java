package excecao;

public class ChecadaVsNaoChecada {
	
	public static void main(String[] args) {
		
		geraErro1();
		
		
		try {
			geraErro2();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Fim : ");
	}

	//Exce��o N�O checada ou N�O verificada, consegue passar
	// despercebido pelos metodos n�o precisa declarar diretamente na assinatura do metodo
	static void geraErro1() throws RuntimeException {
		throw new RuntimeException("Ocorreu um erro #01 "); 
	}
	
	// Exce��o checada ou verificada, uma exce��o noa checada
	// n�o passara despercebido por todos os metodos ou classes criadas
	static void geraErro2() throws Exception {
		new Exception("Ocorreu um erro #02 ");
	}
}
