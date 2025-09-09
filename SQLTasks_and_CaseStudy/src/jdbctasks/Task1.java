
package jdbctasks;
import java.sql.*;


public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Connection conn = (Connection) DriverManager.getConnection( 
					"jdbc:mysql://localhost:3306/testdb", "root", "Epiphany#111" 
					); 
			System.out.println("Connected!");
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		

	}

}
