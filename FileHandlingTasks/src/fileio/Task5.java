package fileio;
import java.io.*;

class Student implements Serializable{
	String name;
	int roll;
	int marks;
	
	Student(String name,int roll,int marks){
		this.name = name;
		this.roll= roll;
		this.marks=marks;
	}
}
public class Task5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Student s = new Student("Alice",104,98);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"));
		oos.writeObject(s); 
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"));
		Student obj = (Student) ois.readObject(); 
		ois.close(); 
		System.out.println("Deserialized Student:: " + obj.name + " Roll No: " + obj.roll + ", Marks: " + obj.marks); 
		
		

	}

}
