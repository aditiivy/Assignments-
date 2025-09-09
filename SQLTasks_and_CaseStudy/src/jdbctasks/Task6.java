package jdbctasks;
import java.sql.*;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url= "jdbc:mysql://localhost:3306/testdb";
		 String username = "root";
		 String password= "Epiphany#111";
		String sql = "UPDATE Students SET email = ? WHERE id = ?"; 
		

		try {
			Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = conn.prepareStatement(sql); 
			pstmt.setString(1, "newbob@example.com"); 
			pstmt.setInt(2, 2); 
			pstmt.executeUpdate(); 
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
