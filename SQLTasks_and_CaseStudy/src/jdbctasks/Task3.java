package jdbctasks;
import java.sql.*;
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String url= "jdbc:mysql://localhost:3306/testdb";
		 String username = "root";
		 String password= "Epiphany#111";
		 String query= """
		 		INSERT INTO Students (id, name, email) VALUES 
                (101, 'Alex', 'alex2@gmail.com'),
                (102, 'Bob', 'bob@gmail.com'),
                (103, 'Claire', 'claire@yahoo.com')
		 		""";
		 try (Connection conn = DriverManager.getConnection(url, username, password);
	             Statement stmt = conn.createStatement()) {

	            stmt.executeUpdate(query);
	            System.out.println("Inserted succesfully");

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

		 

	}

}
