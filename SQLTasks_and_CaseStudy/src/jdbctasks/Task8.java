package jdbctasks;
import java.sql.*;
import java.util.Scanner;
public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url= "jdbc:mysql://localhost:3306/testdb";
		String username = "root";
		String password= "Epiphany#111";
		
		
		try {
			Connection conn = DriverManager.getConnection(url, username, password);
			Scanner sc = new Scanner(System.in); 
			System.out.print("Enter name to search: "); 
			String name = sc.nextLine(); 
			String sql = "SELECT * FROM Students WHERE name = ?"; 
			PreparedStatement pstmt = conn.prepareStatement(sql); 
			pstmt.setString(1, name); 
			ResultSet rs = pstmt.executeQuery(); 
			while (rs.next()) { 
			System.out.println(rs.getInt("id") + " - " + rs.getString("name") + " - " 
			+ rs.getString("email")); 
			} 
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
