package jdbctasks;
import java.sql.*;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url= "jdbc:mysql://localhost:3306/testdb";
		String username = "root";
		String password= "Epiphany#111";
		try {
			Connection conn = DriverManager.getConnection(url, username, password);
			CallableStatement cs = conn.prepareCall("{call getStudentById(?)}"); 
			cs.setInt(1, 2); 
			ResultSet rs = cs.executeQuery(); 
			while (rs.next()) { 
			System.out.println("Name: " + rs.getString("name") + ", Email: " + 
			rs.getString("email")); 
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
