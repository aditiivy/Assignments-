package javasql;
import java.sql.*;


public class CrudOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String url= "jdbc:mysql://localhost:3306/student_management";
		 String username = "root";
		 String password= "Epiphany#111";
//		 String query = " INSERT INTO students(first_name, last_name, dob, email, phone, address) VALUES('Bob','Sullivan','2001-05-10','bobby2gamail.com','9090874321','235 Lawson Street')";
		 try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement()) {
//
//	            stmt.executeUpdate(query);
//	            System.out.println("Inserted succesfully");
		 
			// 1. Create 2 new courses
	            stmt.executeUpdate("INSERT INTO courses(course_name, course_description, credits) VALUES " +
	                    "('Data Structures', 'Learn stacks, queues, trees', 3), " +
	                    "('Databases', 'SQL and relational databases', 4)");
	            System.out.println(" 2 courses inserted.");

	            // 2. Enroll each student in at least one course
	            stmt.executeUpdate("INSERT INTO enrollments(student_id, course_id, enrollment_date, grade) VALUES " +
	                    "(1, 2, '2025-08-05', 'B'), " +
	                    "(2, 1, '2025-08-05', 'A'), " +
	                    "(3, 3, '2025-08-05', 'B'), " +  
	                    "(4, 1, '2025-08-05', 'C')");
	            System.out.println(" Students enrolled in courses.");

	            // 3. Update one student’s name and email
	            stmt.executeUpdate("UPDATE students SET first_name = 'Robert', email = 'robert.sullivan@example.com' WHERE student_id = 4");
	            System.out.println(" Student info updated.");

	            // 4. Change grades for 2 enrollments
	            stmt.executeUpdate("UPDATE enrollments SET grade = 'A+' WHERE enrollment_id = 2");
	            stmt.executeUpdate("UPDATE enrollments SET grade = 'B+' WHERE enrollment_id = 3");
	            System.out.println(" Grades updated.");

	            // 5. List all students enrolled in “Web Development”
	            System.out.println("\n Students enrolled in 'Web Development':");
	            ResultSet rs = stmt.executeQuery("""
	                SELECT s.first_name, s.last_name, s.email
	                FROM students s
	                JOIN enrollments e ON s.student_id = e.student_id
	                JOIN courses c ON e.course_id = c.course_id
	                WHERE c.course_name = 'Web Development'
	            """);

	            while (rs.next()) {
	                System.out.println("- " + rs.getString("first_name") + " " + rs.getString("last_name") +
	                        " (" + rs.getString("email") + ")");
	            }

	            // 6. Delete one course (we'll delete 'Data Structures') and handle relationship
	            // First delete enrollments for that course to avoid foreign key violation
	            stmt.executeUpdate("DELETE FROM enrollments WHERE course_id = 2");
	            stmt.executeUpdate("DELETE FROM courses WHERE course_id = 2");
	            System.out.println(" Deleted course 'Data Structures' and related enrollments safely.");
	            
	            conn.close();		 

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	
		 		
				 
				 

	}

}
