package classe;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
		a1.raio = 10;
		//a1.pi = 10;
		//System.out.println(a1.area());
		
		AreaCirc a2 = new AreaCirc(5); 
		a2.raio = 1000;
		//a2.pi = 6;
		//System.out.println(a2.area());
		
		System.out.println(a1.area());
		
		System.out.println(a2.area());
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
		
		
	}

}