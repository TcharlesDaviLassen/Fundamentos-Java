package classe;

public class Data {
	
	int dia;
	int mês;
	int ano;
	
	
Data(){
//	dia = 1;
//	mês = 1;
//	ano = 1970;
	this(1, 1, 1970); // 
		
	}
	
	Data( int diaInicial, int mesInicial, int anoInicial){
		this.dia = diaInicial;
		this.mês = mesInicial;
		this.ano = anoInicial;
				
	}
	
	String dataFormatada() {
		return String.format("%d/%d/%d", dia, mês, ano);
		
	}

	void imprimirDataFormatada() {
		System.out.println(this.dataFormatada());
	}
}


