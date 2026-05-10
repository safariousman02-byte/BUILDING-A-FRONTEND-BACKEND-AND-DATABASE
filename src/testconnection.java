
import java.sql.*;

public class testconnection {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        String url = "jdbc:postgresql://localhost:5432/student_db";
        String user = "postgres";
        String password = "15H16h17";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("connected to database");
            conn.close();
        }catch (SQLException e) {
                System.out.println("failed to connect to database");
            }

    }
}
