package advancedtask5;
import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Compare by marks (ascending)
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.marks, other.marks);
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 70));
        students.add(new Student("Charlie", 90));
        students.add(new Student("David", 75));

        // Sort using Comparable
        Collections.sort(students);

        System.out.println("Students sorted by marks (ascending):");
        for (Student s : students) {
            System.out.println(s);
        }

	}

}
