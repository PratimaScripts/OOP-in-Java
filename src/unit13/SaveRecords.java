package unit13;

// JDBC

import java.sql.*;

public class SaveRecords {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/megacollege"; //orchid
        String uname = "root";
        String pwd = "";

        try {
            // Step 1: Load the database driver
            Class.forName("com.mysql.jdbc.Driver");

            // Step 2: Create connection to database
            Connection conn = DriverManager.getConnection(url, uname, pwd);

            // Step 3: Create SQL query and execute it
            // Insert a record
            String sql = "INSERT INTO users (name, email) VALUES ('Rakesh','rakesh@gmail.com')";

            // To update:
            // String sql = "UPDATE users SET name = 'Rakeshhhhhhhhhh'";

            // To delete:
            // String sql = "DELETE FROM users WHERE id = 3";

            Statement st = conn.createStatement();
            st.execute(sql);
            conn.close();
            System.out.println("Record saved");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
