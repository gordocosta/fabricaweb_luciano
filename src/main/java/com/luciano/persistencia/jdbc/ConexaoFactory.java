package com.luciano.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

	public static Connection getConnection() {
		
		try {
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/fabricaweb","postgres","123");
		} catch (SQLException e) {
			//relanšando a exeception
			throw new RuntimeException(e);
		}
		
	}

}
