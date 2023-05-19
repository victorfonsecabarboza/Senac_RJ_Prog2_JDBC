package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bancojava.ConnectionFactory;
import model.Contato;

public class ContatoDao {
	// CONEXÃO PRIVADA GLOBAL
	private Connection con;

	// THRWOS PORQUE NÃO EXISTE MAIN
	public ContatoDao() throws SQLException {
		this.con = ConnectionFactory.getConnection();
	}

	// THRWOS PORQUE NÃO EXISTE MAIN
	public void adiciona(Contato contato) throws SQLException {
		String sql = "insert into contatos(nome, email, endereco) values(?, ?, ?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		
		// stmt.setString(1, "Victor");
		stmt.setString(1, contato.getNome());
		stmt.setString(2, contato.getEmail());
		stmt.setString(3, contato.getEndereco());
		stmt.execute();
		stmt.close();
	}
}
