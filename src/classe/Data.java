package classe;

public class Data {
	
	int dia;
	int m�s;
	int ano;
	
	
Data(){
//	dia = 1;
//	m�s = 1;
//	ano = 1970;
	this(1, 1, 1970); // 
		
	}
	
	Data( int diaInicial, int mesInicial, int anoInicial){
		this.dia = diaInicial;
		this.m�s = mesInicial;
		this.ano = anoInicial;
				
	}
	
	String dataFormatada() {
		return String.format("%d/%d/%d", dia, m�s, ano);
		
	}

	void imprimirDataFormatada() {
		System.out.println(this.dataFormatada());
	}
}


