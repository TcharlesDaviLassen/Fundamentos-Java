package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class ConsultarPessoas1 {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas";
		
		Statement stmt = connection.createStatement();
		ResultSet resultado = stmt.executeQuery(sql);// Consege obter os resultados obtidos no banco de dados
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		while (resultado.next()) { // Como se espera receber multiplas linhas vai processando os dados enquanto verdadeiro
								   // e assim que der falso sai do while e fecha o stnt e o connection

			int codigo= resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa (codigo, nome));			
		}
		
		for(Pessoa p: pessoas) {
			System.out.println(p.getCodigo() + "=>" + p.getNome());
			
		}
		
		stmt.close();
		connection.close();
	}
	
}
