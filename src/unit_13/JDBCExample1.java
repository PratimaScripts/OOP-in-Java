package unit_13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// Creating a Database

public class JDBCExample1 {
    static final String DB_URL = "jdbc://mysql://localhost/";
    static final String USER = "guest";
    static final String PASS = "guest123";

    public static void main(String[] args) {
        // Open a connection
        try (
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
        ) {
            String sql = "CREATE DATABASE STUDENTS";
            stmt.executeUpdate(sql);
            System.out.println("Database Created Successfully...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
