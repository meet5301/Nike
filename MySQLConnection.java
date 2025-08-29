import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    public static void main(String[] args) {
        // 1. JDBC URL syntax: jdbc:mysql://host:port/databaseName
        String jdbcURL = "jdbc:mysql://localhost:3306/your_database_name";
        String username = "your_username";
        String password = "your_password";

        // 2. Create Connection object
        Connection connection = null;

        try {
            // 3. Load and register MySQL JDBC driver (optional in JDBC 4+)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 4. Open connection
            connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Connected to MySQL database!");

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        } finally {
            // 5. Close connection
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
