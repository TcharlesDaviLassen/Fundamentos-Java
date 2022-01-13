package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
	

		public static void main(String[] args) throws SQLException {

			final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true"; 
			final String usuario = "root";
			final String password = "@#@#Tdl13";

			Connection connection = DriverManager
					.getConnection(url, usuario, password);
			
			Statement stmt = connection.createStatement();
			stmt.execute("CREATE DATABASE curso_java");
			
			System.out.println("Conexão efetuada com sucesso");
			connection.close();
		
	}

}
