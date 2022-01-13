package jdbc;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class AlterarNomePessoa {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o c�digo da pessoa: ");
		int codigo = entrada.nextInt();
		
		String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
		String update = " UPDATE pessoas SET nome = ? WHERE codigo = ?";
		
		Connection conexao = FabricaConexao.getConexao();
		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, codigo);
		ResultSet r = stmt.executeQuery();
		
		
		//Se r.next tiver presente, no caso, o c�digo do id
		//Cria a pessoa, mostra o nome atual e a atualiza con forme o usu�rio a clocar
		if (r.next()) {
			Pessoa p = new Pessoa(r.getInt(1), r.getString(2));
			
			System.out.println("O nome atual � " + p.getNome());
			entrada.nextLine();
			
			System.out.println("Informe o novo nome: ");
			String novoNome = entrada.nextLine();
			
			stmt.close();
			
			//Cria o novo usu�rio a partir desse comando update
			stmt = conexao.prepareStatement(update);
			// Novo nome que foi fornecido pelo usu�rio 
			stmt.setString(1, novoNome);
			// Seta o usu�rio
			stmt.setInt(2, codigo);
			
			//Salva o dado atualizado no Banco de Dados SQL
			stmt.execute();
			
			System.out.println("Pessoa add com sucesso! ");
			//se caso n�o encontra o c�digo da pessoa 
		}else{
			System.out.println("Pessoa n�o encontrada");
			
		}
		
		conexao.close();
		entrada.close();
	}		
}