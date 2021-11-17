package br.com.alura.jdbc;

import java.sql.SQLException;

public class TestePoolConexoes {
	
	public static void main(String[] args) throws SQLException {
		
	
	ConnectionFactory connectionFactory = new ConnectionFactory();
	
		for(int i = 0; i < 20; i++) {
			connectionFactory.recuperarConexao();
			System.out.println("Conexao de numero: "+i);
		}
	}
}