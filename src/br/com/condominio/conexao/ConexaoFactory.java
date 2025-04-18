package br.com.condominio.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static void main(String[] args) throws SQLException 	{
		
		Connection conexao = null;
		String url = "jdbc:mysql://localhost:3306/condominio";
		conexao = DriverManager.getConnection(url, "root", "*123456HAS*");
		System.out.println("Abriu a conexão.");
		conexao.close();
	}
	
}
