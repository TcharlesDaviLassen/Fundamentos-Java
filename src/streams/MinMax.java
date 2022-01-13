package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class MinMax {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		
//	 Modo mais implementativo de rescrever o metodo pode se usar LAMDAS
//		Comparator<Aluno> melhorNota = new Comparator<Aluno>() {
//			@Override
//			public int compare(Aluno o1, Aluno o2) {
//				return 0;
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		// quando comparar precisa implementar Comparetor
		Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
			if (aluno1.nota > aluno2.nota) return 1;
			if (aluno1.nota < aluno2.nota) return - 1;
			return 0;
			};
			
			System.out.println(alunos.stream().max(melhorNota).get()); // Se deixar assim gera um HashCode e devera ser tradado na classe que é chamada sobrescrevendo um outro metodo 
	}
}