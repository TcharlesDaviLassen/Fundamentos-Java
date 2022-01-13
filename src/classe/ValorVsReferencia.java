package classe;

public class ValorVsReferencia {
	
public static void main(String[] args) {
	
	
	double a = 2;
	double b = a;// Atribui�ao por valor ( Tipo priitivo)
		
	a++;
	b--;
	
	System.out.println(a + " " + b);
	
	Data d1 = new Data(1, 6, 2022);
	Data d2 = d1; // atribui��o por refer�ncia (Objeto)
	
	d1.dia = 31;
	d2.m�s = 12;
	
	 
	System.out.println(d1.dataFormatada());
	System.out.println(d2.dataFormatada());
	
	voltarDataParaValorPadrao(d1);
	
	System.out.println(d1.dataFormatada());
	System.out.println(d2.dataFormatada());
	
	int c = 5;
	alterarPrimitivo(c);
	System.out.println(c);
	}

static void voltarDataParaValorPadrao(Data d) { // o metodo STATIC s� retorna a ele mesmo
	d.dia = 1;
	d.m�s = 1;
	d.ano = 1970;
	}
static void alterarPrimitivo(int a) {
	a++;
}
}

