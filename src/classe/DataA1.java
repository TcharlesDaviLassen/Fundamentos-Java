package classe;

public class DataA1 {
	
	
	int dia;
	int mes;
	int ano;
	
	String dataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
		
	}

	void imprimirDataFormatada() {
		System.out.println(dataFormatada());
	}
}
