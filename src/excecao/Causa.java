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
// Então mais uma dica importantíssima sobre tratamento de erros aqui os erros podem ter mais de uma
//sequência de casos, uma exceção causa uma outra exceção que causa uma outra exceção e você pode
//passar uma exceção original como causa de um ou outro essa ação é importante que você sabe sobre isso.