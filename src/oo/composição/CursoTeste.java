package oo.composi��o;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("A");
		Aluno aluno2 = new Aluno("B");
		Aluno aluno3 = new Aluno("C");
	
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2023");
		Curso curso3 = new Curso("React Native");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarAluno(curso3);
		aluno2.adicionarAluno(curso3);
		aluno3.adicionarAluno(curso3);
		
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado no curso " 
					+ curso1.nome + "...");
			System.out.println("...e o nome � " + aluno.nome);
			System.out.println();
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
//			System.out.println(cursoEncontrado.alunos);
		}
	}
}
