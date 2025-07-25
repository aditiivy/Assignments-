package service;

import Model.Student;



public class StudentService {
	private Student student;

    public void saveStudent(Student s) {
        this.student = s;
        System.out.println("Student saved.");
    }
    
    public void printStudent() {
        if (student != null) {
            System.out.println("Student Name: " + student.name);
            System.out.println("Roll Number: " + student.roll);
        } else {
            System.out.println("No student found.");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
