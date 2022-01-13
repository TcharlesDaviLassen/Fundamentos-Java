package streams;

public class Aluno {
	
	public final String nome; //Atributo
	public	final double nota;
	public final boolean bomComportamento;
	
	public Aluno(String nome, double nota) {
		this(nome, nota, true); // Apartir do THIS pode se chamar um costrutor chamando outro construtor
	}
	
	public Aluno(String nome, double nota, boolean bomComportamento) {
		this.nome = nome;
		this.nota = nota;
		//Adicionando um novo parametro para o desafio filter
		this.bomComportamento = bomComportamento;
	}
	
	public String toString() {
		return nome + " Tem nota " + nota;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (bomComportamento ? 1231 : 1237);
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(nota);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (bomComportamento != other.bomComportamento)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(nota) != Double.doubleToLongBits(other.nota))
			return false;
		return true;
	}

	
}
