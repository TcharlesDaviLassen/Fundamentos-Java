package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data p1 = new Data();
		
		
		
		Data p2 = new Data(1, 12, 3000);
//		p2.dia = 1 ;
//		p2.mês = 12;
//		p2.ano = 3000;
//		System.out.printf("%d/%d/%d \n", p2.dia, p2.mês, p2.ano);
		
		String dataFormatada1 = p1.dataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(p2.dataFormatada());
		
		
		
	}
	
}
