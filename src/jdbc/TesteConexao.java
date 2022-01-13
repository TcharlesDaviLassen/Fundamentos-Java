package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {

		final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true"; // Se caso tive que acessar outra porta
																								// que não seja a que vem por padrão espesifica depois do =>
																								// localhost:3307
		final String usuario = "root";
		final String password = "@#@#Tdl13";

		Connection connection = DriverManager.getConnection(url, usuario, password);// Lançar um throws SQLException
																					// para não gerar o erro de código

		System.out.println("Conexão efetuada com sucesso");
		connection.close();
	}
}
