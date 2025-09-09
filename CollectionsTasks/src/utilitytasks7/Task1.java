package utilitytasks7;
import java.util.*;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Ruby");

        System.out.println("Original List: " + list);

        Collections.reverse(list);

        System.out.println("Reversed List: " + list);

	}

}
