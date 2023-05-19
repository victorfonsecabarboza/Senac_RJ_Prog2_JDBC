package view;

import java.sql.SQLException;

import dao.ContatoDao;
import model.Contato;

public class TesteDaoInsere {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Maria");
		contato.setEmail("maria@email.com");
		contato.setEndereco("Av Brasil, 1000");

		ContatoDao dao;
		try {
			dao = new ContatoDao();
			dao.adiciona(contato);
			System.out.println("Gravação realizada com sucesso !!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
