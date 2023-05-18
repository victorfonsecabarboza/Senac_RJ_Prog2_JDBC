package bdjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTeste {

	public static void main(String[] args) {
		// CRIAÇÃO DAS VARIAVEIS CONTENDO AS INFORMAÇÕES DO BANCO DE DADOS
		// QUE IRA SER CONECTADO
		String url = "jdbc:mysql://localhost:3306/test?useTimezone=true&serverTimezone=UTC";
		String usuario = "root";
		String senha = "";

		try {
			// CONECTION CON: CIRAÇÃO DE UM PONTEIRO PARA ARMAZENAR AS INFORMAÇÕES
			// DO BANCO DE DADOS
			// DRIVENANAGER: INICIAR A CONEXÃO COM O BANCO DE DADOS DO MYSQL INFORMANDO NA
			// STRING DE CONEXÃO AS VARIAVEIS CRIADAS ACIMA COM AS INFORMAÇÕES FORNECIDAS
			Connection con = DriverManager.getConnection(url, usuario, senha);
			// TESTE PARA VERIFICAR SE ESTÁ TUDO CORRETO
			System.out.println("Conexão bem sucedida com o banco de dados !!!");
			// ENCERRAMENTO DO PONTEIRO
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
