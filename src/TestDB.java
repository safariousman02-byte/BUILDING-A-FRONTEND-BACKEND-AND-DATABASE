import java.sql.*;

public class TestDB {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/student_db";
        String user = "postgres";
        String password = "15H16h17";
        
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ CONNECTED TO DATABASE!");
            conn.close();
        } catch (SQLException e) {
            System.out.println("❌ FAILED: " + e.getMessage());
        }
    }
}