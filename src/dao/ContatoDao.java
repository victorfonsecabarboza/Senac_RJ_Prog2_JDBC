package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bancojava.ConnectionFactory;
import model.Contato;

public class ContatoDao {
	// CONEXÃO PRIVADA GLOBAL
	private Connection con;

	// THRWOS PORQUE NÃO EXISTE METODO MAIN
	public ContatoDao() throws SQLException {
		this.con = ConnectionFactory.getConnection();
	}

	// THRWOS PORQUE NÃO EXISTE METODO MAIN
	public void adiciona(Contato contato) throws SQLException {
		String sql = "insert into contatos(nome, email, endereco) values(?, ?, ?)";
		PreparedStatement stmt = con.prepareStatement(sql);

		// INFORMAÇÃO HARDCODE
		// stmt.setString(1, "Victor");

		stmt.setString(1, contato.getNome());
		stmt.setString(2, contato.getEmail());
		stmt.setString(3, contato.getEndereco());
		stmt.execute();
		stmt.close();
	}

	public List<Contato> getLista() throws SQLException {
		String sql = "select *from contatos";
		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet rset = stmt.executeQuery();
		List<Contato> contatos = new ArrayList<Contato>();

		while (rset.next()) {
			Contato contato = new Contato();
			contato.setNome(rset.getString("nome"));
			contato.setEmail(rset.getString("email"));
			contato.setEndereco(rset.getString("endereco"));
			contatos.add(contato);
		}
		// FECHAR CONEXÃO
		rset.close();
		stmt.close();
		// RETORNA A LISTA
		return contatos;
	}
}
