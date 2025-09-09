package mapstask3;
import java.util.*;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> Student = new HashMap<>();
		
		Student.put(101, "Aditi");
        Student.put(102, "Rahul");
        Student.put(103, "Sneha");
        Student.put(104, "Aryan");
        Student.put(105, "Meera");

        // Remove one entry
        Student.remove(103);
        
        System.out.println("Student Roll Numbers and Names:");
        for (Map.Entry<Integer, String> entry : Student.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
		
		

	}

}
