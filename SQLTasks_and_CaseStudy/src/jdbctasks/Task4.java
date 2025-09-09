package jdbctasks;
import java.sql.*;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url= "jdbc:mysql://localhost:3306/testdb";
		String username = "root";
		String password= "Epiphany#111";
		Connection conn;
		try {
			conn = DriverManager.getConnection(url, username, password);
			Statement stmt = conn.createStatement(); 
			ResultSet rs = stmt.executeQuery("SELECT * FROM Students"); 
			while (rs.next()) { 
			System.out.println(rs.getInt("id") + " - " + rs.getString("name") + " - " 
			+ rs.getString("email")); 
			} 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
