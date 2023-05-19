package bancojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	// CRIAÇÃO DO METODO PARA PEGAR A CONEXÃO DO BANCO DE DADOS
	public static Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/test?useTimezone=true&serverTimezone=UTC";
		String usuario = "root";
		String senha = "";

		return DriverManager.getConnection(url, usuario, senha);
	}

}
