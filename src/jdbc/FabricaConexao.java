package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class FabricaConexao {


	public static Connection getConexao() {
		try {
			// Aqui foi extarnilizado as informações do banco de dados coloconado apenas as informações e chamando a função
			Properties prop = getProperties();
			final String url = prop.getProperty("banco.url");
			final String usuario = prop.getProperty("banco.usuario");
			final String password = prop.getProperty("banco.senha");

			return DriverManager.getConnection(url, usuario, password);
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		} 
	}
	
	private static Properties getProperties() throws IOException {
		Properties prop = new Properties();
		String caminho = "/conexao.properties";
		prop.load(FabricaConexao.class.getResourceAsStream(caminho));// getResourceAsStream ta sendo responsavel por ler e carregar o arquivo Properties
		return prop;
	}
}

 
