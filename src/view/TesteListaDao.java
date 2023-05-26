package view;

import java.sql.SQLException;
import java.util.List;

import dao.ContatoDao;
import model.Contato;

public class TesteListaDao {

	public static void main(String[] args) {
		// TRY CATCH POIS EXISTE O MÉTODO MAIN
		try {
			ContatoDao cdao = new ContatoDao();
			List<Contato> contatos = cdao.getLista();

			for (Contato contato : contatos) {
				System.out.println("Nome: " + contato.getNome());
				System.out.println("E-mail: " + contato.getEmail());
				System.out.println("Endereço: " + contato.getEndereco());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
