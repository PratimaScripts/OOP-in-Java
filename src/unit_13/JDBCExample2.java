package unit_13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Selecting Database

public class JDBCExample2 {
	static final String DB_URL = "jdbc://mysql://localhost/Student";
	static final String USER = "guest";
	static final String PASS = "guest123";
	
	public static void main (String[] args) {
		System.out.println("Connecting to a selected database...");
		// Open a connection
		try(
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		){
			System.out.println("Connected database successfully...");
		} catch(SQLException e){
			e.printStackTrace();
		}
	}
}
