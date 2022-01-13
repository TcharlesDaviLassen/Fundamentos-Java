package Colecoes;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios =  new HashMap<Integer, String>();
		
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Ricardo");
		usuarios.put(3,"Rafaela");
		usuarios.put(4,"Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println();
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.entrySet());
		System.out.println();
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Rebeca"));
		System.out.println();
		System.out.println();
		
		System.out.println(usuarios.get(4));
		System.out.println();
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		System.out.println();
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		System.out.println();
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) { // Esse modelo de for permite rodar dois for's ao mesmo tempo
			System.out.print(registro.getKey() + "==>");
			System.out.println(registro.getValue());
		}
		 
	}

}
