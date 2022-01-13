  package Fundamento;

public class OperadoresLógicos {

	public static void main(String[] args) {
		
	
	boolean condiçao1 = true;
	boolean condiçao2 = 3 > 7;
	
	System.out.println(condiçao1 && !condiçao2);
	System.out.println(condiçao1 ||  condiçao2);
	System.out.println(condiçao1  ^   condiçao2);
	System.out.println(!!condiçao1);
	System.out.println(!condiçao2);
	
	System.out.println("\nTabela verdade E");
	System.out.println(true && true);
	System.out.println(true && false);
//	  System.out.println(false && true);
//    System.out.println(false && false);
   
    System.out.println("\nTabela verdade OU");
//    System.out.println(true || true);
//    System.out.println(true || false);
    System.out.println(false || true);
    System.out.println(false || false);
	
    System.out.println("\nTabela verdade OU Exclusivo");
    System.out.println(true ^ true);
    System.out.println(true ^ false);
    System.out.println(false ^ true);
    System.out.println(false ^ false);
   
    System.out.println("\nTabela verdade Não");
    System.out.println(!true);
    System.out.println(!false);
    
    
	
	}
}

