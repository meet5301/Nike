import java.sql.*;

public class RegisterUser {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/nike_users";
        String dbUser = "root";
        String dbPass = "your_password";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(jdbcUrl, dbUser, dbPass);

            // STEP 4: Example insert
            String query = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, "meetgol");  // username
            stmt.setString(2, "12345");    // password (hash this in real apps)
            stmt.setString(3, "meet@example.com"); // email

            int rows = stmt.executeUpdate();
            System.out.println(rows > 0 ? "User registered!" : "Failed to register.");

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
