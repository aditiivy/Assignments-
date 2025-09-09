package jdbctasks;
import java.sql.*;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url= "jdbc:mysql://localhost:3306/testdb";
		String username = "root";
		String password= "Epiphany#111";
		String sql = "DELETE FROM Students WHERE id = ?"; 
		PreparedStatement pstmt;
		try {
			Connection conn = DriverManager.getConnection(url, username, password);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 1); 
			pstmt.executeUpdate(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		


	}

}
