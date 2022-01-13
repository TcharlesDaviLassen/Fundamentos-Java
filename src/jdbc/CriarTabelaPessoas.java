package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {

	public static void main(String[] args)  throws SQLException {
		Connection connection = FabricaConexao.getConexao();
	// Esse metodo de text block surgiu aparti do jdk 13 	
		String sql = "CREATE TABLE IF NOT EXISTS pessoas ("
				+ "codigo INT AUTO_INCREMENT PRIMARY KEY,"
				+"nome VARCHAR(80) NOT NULL"
				+")";
		
	Statement stmt = connection.createStatement();
	stmt.execute(sql);
	
	System.out.println("TABELA INSERIDA COM EXITO, BOA ENFRENTE O PROXIMO NIVEL");
	connection.close();
	}
}
// Cuidado com o ataque do SQL Injection é um tipo de ataque de injeção
// que possibilita a execução de instruções SQL mal-intencionadas.
// Essas instruções controlam um servidor de banco de dados atrás de um aplicativo da web.
// Os invasores podem usar vulnerabilidades de SQL Injection para ignorar as medidas de segurança do aplicativo.

//=> como funciona 

//package jdbc;
//
//import java.sql.SQLException;
//import java.util.Scanner;
//
//public class NovaPessoa {
//
//	public static void main(String[] args) throws SQLException{
//		
//		Scanner entrada = new Scanner(System.in);
//		
//		System.out.println("Informe o nome: ");
//		String nome = entrada.nextLine();
//		
//		String sql = "INSET INTO pessoas (nome) VALUES('"+ nome + "')";
//		
//		System.out.println(sql);
//		entrada.close();
//		
//	}
//}

// Digamos que houvesse esse código, poderia ser feito no banco de dados 

// SET SQL_SAFE_UPDATE = 0; -- esse comando é para configurar o savemode do SQL

// INSERT INTO pessoas (nome) VALUES ('leo');delete from pessoas where ( '1' = '1');

// Para não ocorrer esse problema pode se modificar a linha => 
//String sql = "INSET INTO pessoas (nome) VALUES('"+ nome + "')"; para
//String sql = "INSET INTO pessoas (nome) VALUES(?)"; e usar o PreparedStatement
