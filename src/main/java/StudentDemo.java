import javax.sql.RowSet;
import java.sql.*;

public class StudentDemo {
    public static void connectingToDatabase() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/Payroll_service";
        String username = "root";
        String password = "Tanuja@99";
        Connection con = DriverManager.getConnection(url, username, password);

        Statement statement = con.createStatement();

        String query = "SELECT * FROM employee_payroll;";

        ResultSet result = statement.executeQuery(query);
        while (result.next()) {
            System.out.println(result.getInt("id") + " " + result.getString("name") + " "
                    + result.getString("gender")+" " + result.getString("department"));
        }
        con.close();
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        connectingToDatabase();

    }
}