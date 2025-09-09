package iteratorstask4;
import java.util.*;
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Ankit");
        names.add("Charlie");
        names.add("Aditi");

        System.out.println("Original list: " + names);
        
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.startsWith("A")) {
                iterator.remove(); // Safely remove using Iterator
            }
        }

        System.out.println("After removing names starting with 'A': " + names);

	}

}
