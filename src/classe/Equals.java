package classe;

public class Equals {
	
//	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Harvey Specter";  
		u1.email = "harveyspecter@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Harvey Specter";
		u2.email = "harveyspecter@gmail.com";
	
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
	//	System.out.println(u2.equals(new Date()));
		
		
	}

}
