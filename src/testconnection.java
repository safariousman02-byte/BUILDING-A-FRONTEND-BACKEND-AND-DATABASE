import java.sql.*;

public class testconnection {
    public static void main(String[] args) throws Exception {  // ← ADD "throws Exception"
        String url = "jdbc:postgresql://localhost:5432/student_db";
        String user = "postgres";
        String password = "15H16h17";
        
        Connection con = DriverManager.getConnection(url, user, password);
        ResultSet rs = con.createStatement().executeQuery("SELECT * FROM students");
        
        while (rs.next()) {
            System.out.println(rs.getString("name") + " - " + rs.getInt("grade"));
        }
        con.close();
    }
}