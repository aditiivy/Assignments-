package liststask1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<>();

        // Add some integers
        numbers.add(42);
        numbers.add(10);
        numbers.add(85);
        numbers.add(31);
        numbers.add(7);

        // Ascending order
        Collections.sort(numbers);
        System.out.println("Ascending Order: " +  numbers );

        // Descending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending Order: " + numbers);

	}

}
