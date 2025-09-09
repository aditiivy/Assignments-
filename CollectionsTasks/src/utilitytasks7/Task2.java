package utilitytasks7;
import java.util.*;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C++");
        list.add("Java");

        int count = Collections.frequency(list, "Java");

        System.out.println("List: " + list);
        System.out.println("\"Java\" appears " + count + " times.");

	}

}
