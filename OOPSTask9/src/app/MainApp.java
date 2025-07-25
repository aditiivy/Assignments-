package app;

import Model.Student;
import service.StudentService;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Aditi", 101);
        StudentService service = new StudentService();
        service.saveStudent(student);
        service.printStudent();

	}

}
