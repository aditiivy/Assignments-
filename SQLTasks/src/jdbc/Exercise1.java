package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password" ); 
			System.out.println("Connected!"); 
			conn.close(); 
			} catch (SQLException e) { 
			e.printStackTrace(); 
			}
		

	}

}
