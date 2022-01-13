package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

	/*
	 * O padrão DAO é um padrão de projeto que abstrai e encapsula os mecanismos de acesso a dados 
	 * escondendo os detalhes da execução da origem dos dados. 
	 * Já deu para notar que esse padrão é muito usado em aplicações que utilizam banco de dados relacionais.
	 */
	
	private Connection conexao;
	
	public int incluir(String sql, Object... atributos) {
		try {
			PreparedStatement stmt = getConexao().prepareStatement(
					sql, PreparedStatement.RETURN_GENERATED_KEYS);
			adicionarAtributos(stmt, atributos);
			
			if(stmt.executeUpdate() > 0 ) {
				ResultSet resultado = stmt.getGeneratedKeys();
				
				if(resultado.next()) {
					return resultado.getInt(1);
				}
			}
			
			//Grava as informações em caso de problema se os dados não são gravados
			conexao.commit();
			
			
			return -1;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void close() {
		try {
			getConexao().close();
		}catch (SQLException e) {
			
		}finally {
			conexao = null;
		}
	}
	
	
	private void adicionarAtributos(PreparedStatement stmt,
			Object[] atributos) throws SQLException {
		
		
		int indice = 1;
		for(Object atributo: atributos) {
			if(atributo instanceof String) {
				stmt.setString(indice, (String)atributo);
			} else if (atributo instanceof Integer) {
				stmt.setInt(indice, (Integer)atributo);
			}
			
			indice++;
		}
	}
	
	
	private Connection getConexao() {
		try {
			if (conexao !=null && !conexao.isClosed()) {
				return conexao;			
			} 
		} catch (SQLException e) {

			}
			
			conexao = FabricaConexao.getConexao();
			return conexao;
		}
		
	}
