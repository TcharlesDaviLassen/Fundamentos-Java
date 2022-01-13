package excecao.personalizadaB;

import excecao.Aluno;

public class TesteValidacoes {
	
	public static void main(String[] args)  {
		
		try {
			Aluno aluno = new Aluno("Ana", 7);
			Validar.aluno(aluno);
			
			Validar.aluno(null);
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (IllegalAccessException 
				| NumeroForaIntervaloException e) { // Se tiver tratamentos de forma diferentes usar o CATCH
			System.out.println(e.getMessage());
		}

		System.out.println("Fim :");
	}

}
