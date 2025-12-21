package CollectionsExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class oracletest {
	public static void main(String[] a) {
		try {
			Connection con = null;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@10.158.207.121:1521:pravin",
					"hibernate", "hibernate");
			Statement s = con.createStatement();
			s.execute(" insert into USERTABLE values (25,'AKGUPTA','ANIL','AKGUPTA','AKGUPTA@GMAIL.COM')");
			s.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	System.out.println("*******Inserted Successfully**********");
	
	}
}
