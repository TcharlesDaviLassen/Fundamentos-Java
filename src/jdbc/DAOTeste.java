package jdbc;

public class DAOTeste {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUE (?)";
		
		System.out.println(dao.incluir(sql,"ADD"));
		System.out.println(dao.incluir(sql,"UM"));
		System.out.println(dao.incluir(sql,"TESTE"));
		System.out.println(dao.incluir(sql,"SQL"));
		
		dao.close();
	}

}
