package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {

		final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true"; // Se caso tive que acessar outra porta
																								// que n�o seja a que vem por padr�o espesifica depois do =>
																								// localhost:3307
		final String usuario = "root";
		final String password = "@#@#Tdl13";

		Connection connection = DriverManager.getConnection(url, usuario, password);// Lan�ar um throws SQLException
																					// para n�o gerar o erro de c�digo

		System.out.println("Conex�o efetuada com sucesso");
		connection.close();
	}
}
