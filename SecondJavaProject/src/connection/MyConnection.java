package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.function.Predicate;

public class MyConnection {
	
	private static String url = "jdbc:mysql://localhost:3306/formation?autoReconnect=true&useSSL=false";
	private static String user = "root";
	private static String password = "root";
	private static Connection connexion = null;
	
	private MyConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			connexion = DriverManager.getConnection(url, user, password);
		}
		catch (Exception e){e.printStackTrace();}
	}
	
	public static Connection getConnection() {
		if (connexion==null) {
			new MyConnection();
		}
		return connexion;
	}
	
	public static void stop() {
		if (connexion != null) {
			try {connexion.close();} 
			catch (SQLException e) {e.printStackTrace();}
		}
	}

}
