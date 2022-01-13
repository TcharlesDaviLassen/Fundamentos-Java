package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;



public class NovaPessoa {

	public static void main(String[] args) throws SQLException{
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o nome: ");
		String nome = entrada.nextLine();
		
		Connection connection = FabricaConexao.getConexao();
		
		String sql = "INSERT INTO pessoas (nome) VALUES(?)";//String sql = "INSERT INTO pessoas (nome, codigo) VALUES(?, ?)" 
															//se caso quiser ordernar e inserir de conforme quiser os numeros do ID

		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, nome);
		// Aqui teria que criar um novo parâmetro
		// onde => stmt.setString(1, nome); seria stmt.setString(2, 100);
		
		stmt.execute();
		
		System.out.println("Pessoa incluida com secesso !");
		entrada.close();
		
	}
}
