package advancedtask5;
import java.util.*;

class Stu{
    String name;
    int marks;

    Stu(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}


public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Stu> students = new ArrayList<>();

        students.add(new Stu("Charlie", 90));
        students.add(new Stu("Alice", 85));
        students.add(new Stu("David", 75));
        students.add(new Stu("Bob", 70));

        // Sort using Comparator by name
        students.sort(new Comparator<Stu>() {
            public int compare(Stu s1, Stu s2) {
                return s1.name.compareTo(s2.name);
            }
        });

        System.out.println("Students sorted by name (alphabetically):");
        for (Stu s : students) {
            System.out.println(s);
        }

	}

}
