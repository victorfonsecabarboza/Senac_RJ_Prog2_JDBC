package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bancojava.ConnectionFactory;

public class JdbcInsere {

	public static void main(String[] args) {
		try {
			// 
			Connection con = ConnectionFactory.getConnection();
			// INSERIR INFORMAÇÕES NA TABELA
			String sql = "insert into contatos(nome, email, endereco) values(?, ?, ?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			
			// NUMERAÇÃO CORRESPONDE A ORDEM DOS CAMPOS ACIMA
			stmt.setString(1, "Victor");
			stmt.setString(2, "exemplo@email.com");
			stmt.setString(3, "Alguma Rua, 19");
			stmt.execute();
			stmt.close();
			
			System.out.println("Gravação realizada com sucesso no banco de dados !!!");
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
