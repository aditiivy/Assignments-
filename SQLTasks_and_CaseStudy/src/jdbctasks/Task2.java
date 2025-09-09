package jdbctasks;
import java.sql.*;
public class Task2 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		String url= "jdbc:mysql://localhost:3306/testdb";
		 String username = "root";
		 String password= "Epiphany#111";
		 String createTable= "CREATE TABLE Students(id INT PRIMARY KEY, name \r\n"
		 		+ "VARCHAR(100), email VARCHAR(100))";
		 try (Connection conn = DriverManager.getConnection(url, username, password);
	             Statement stmt = conn.createStatement()) {

	            stmt.executeUpdate(createTable);
	            System.out.println("Table 'users' created successfully!");

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

		
		

	}

}
