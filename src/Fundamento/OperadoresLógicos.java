  package Fundamento;

public class OperadoresL�gicos {

	public static void main(String[] args) {
		
	
	boolean condi�ao1 = true;
	boolean condi�ao2 = 3 > 7;
	
	System.out.println(condi�ao1 && !condi�ao2);
	System.out.println(condi�ao1 ||  condi�ao2);
	System.out.println(condi�ao1  ^   condi�ao2);
	System.out.println(!!condi�ao1);
	System.out.println(!condi�ao2);
	
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
   
    System.out.println("\nTabela verdade N�o");
    System.out.println(!true);
    System.out.println(!false);
    
    
	
	}
}

