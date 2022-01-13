package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafiuConsultaResposta {
	
public static void main(String[] args) throws SQLException {
		// Aqui vamos criar um codigo que pesquise parte ou toda a pesquisa digitada englobada entre oo persentual
	
	Scanner entrada = new Scanner(System.in);
	
	Connection connection = FabricaConexao.getConexao();
	String sql = "SELECT * FROM pessoas WHERE nome like ?";// <= onde o código foi modificado
		 
	System.out.println("Informe o valor pra pesquisa: ");
	String valor = entrada.nextLine();
	
		PreparedStatement stmt = connection.prepareStatement(sql);// <= onde o código foi modificado
		stmt.setString(1, "%" + valor + "%");
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
		entrada.close();
	}

}
