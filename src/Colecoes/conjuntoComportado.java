package Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class conjuntoComportado {
	
	public static void main(String[] args) {
		
	//	Set<String> lista = new HashSet<String>(); // S� aceitara uma amarra��o que foi especificada dentro da variavel <x>
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("LUca");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados ) {
			System.out.println(candidato);
		}
		
		Set<Integer>nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for(int n: nums) {
			System.out.println(n);
		}
	}

}
