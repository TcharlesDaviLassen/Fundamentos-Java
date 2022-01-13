package excecao;

public class Causa {

	
	public static void main(String[] args) {
		
		try {
			metodoA(null);
		} catch (IllegalArgumentException e) {
			if(e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			}
		}

		metodoA(null);
	}
	
	static void metodoA(Aluno aluno) {
		try {
			metodoB(aluno);
		} catch (Exception causa) {
			throw new IllegalArgumentException(causa);
		}
	}
	static void metodoB(Aluno aluno) {
		if(aluno == null);
	}
}
// Ent�o mais uma dica important�ssima sobre tratamento de erros aqui os erros podem ter mais de uma
//sequ�ncia de casos, uma exce��o causa uma outra exce��o que causa uma outra exce��o e voc� pode
//passar uma exce��o original como causa de um ou outro essa a��o � importante que voc� sabe sobre isso.