package unit_13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// Example for Inserting Record

public class JDBCExample4 {
    static final String DB_URL = "jdbc:mysql://localhost/Student";
    static final String USER = "guest";
    static final String PASS = "guest123";

    public static void main(String[] args) {
        // Open a connection
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
        ) {
            // Execute a query
            System.out.println("Inserting records into the table...");
            String sql = "INSERT INTO Registration VALUES (100, 'Zera', 'Khan', 18)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Registration VALUES (101, 'Mohit', 'Shah', 19)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Registration VALUES (102, 'Akhshay', 'Adhikari', 22)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO Registration VALUES (103, 'Sumit', 'Poudel', 21)";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
