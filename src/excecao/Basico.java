package excecao;

import streams.Aluno;

public class Basico {
	
	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		try	{
			imprimirNomeDoAluno(a1);		
		} catch(Exception excecao) {
			System.out.println("Ocorreu um erro no momento"
			+ "de imprimir o nome do usuario");
		}
		
		
		try {// Um bloco try é um bloco que pode vir a causar um erro
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {//Se caso quiser trarar o erro pode usas o Catch
			System.out.println("Ocorreu o erro: " + e.getMessage());//e.printStackTrace();
		}
		
		System.out.println("Fim :");
	}

	public static void imprimirNomeDoAluno(Aluno aluno)	{
		System.out.println(aluno.nome);
	}
}
