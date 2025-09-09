package jdbctasks;

import java.sql.*;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url= "jdbc:mysql://localhost:3306/testdb";
		String username = "root";
		String password= "Epiphany#111";
		String sql = "INSERT INTO Students (id, name, email) VALUES (?, ?, ?)"; 
		
		try {
		Connection conn = DriverManager.getConnection(url, username, password);
			
		PreparedStatement pstmt = conn.prepareStatement(sql); 
		pstmt.setInt(1, 3); 
		pstmt.setString(2, "Charlie"); 
		pstmt.setString(3, "charlie@example.com"); 
		pstmt.executeUpdate(); 
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
