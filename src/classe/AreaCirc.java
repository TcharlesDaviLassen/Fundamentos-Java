 package classe;

public class AreaCirc {
	
	double raio;
	static final double PI = 3.1415;   // Grande maioria das vezes quando se tem algo estático acaba se criado uma constante, no caso d STATIC FINAL
	// FINAL e um modificador para definir uma constante.
	
	AreaCirc(double raioInicial){
		raio = raioInicial;
	//	pi = 3.14;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	

}
