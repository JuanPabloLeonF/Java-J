package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {

	 private static final String url = "jdbc:mysql://localhost:3306/jhoana2";
	 private static final String usuario = "root";
	 private static final String contraseña = "1234567";
	 
	 public static Connection getConnection() throws SQLException {
	        return DriverManager.getConnection(url, usuario, contraseña);
	    }
}
