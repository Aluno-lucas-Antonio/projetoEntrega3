package conexaojdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnection {
	private static String url = "jdbc:postgresql://localhost:5432/projetopoo";
	private static String password = "15080429";
	private static String user = "postgres";
	private static Connection connection = null;
	
	
	public SingleConnection() {
		conectar();
	}
	
	static {
		conectar();
	}
	
	
	private static void conectar() {
		
		try {
			if(connection == null) {
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection(url, user, password);
				connection.setAutoCommit(false);
				System.out.println("Conectou com Sucesso!!");
				
				
			}	
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnetion() {
		return connection;
		
	}
	
	
	
	
}
