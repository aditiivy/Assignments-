package TasksOOPS.Task12;

import java.util.*; 



public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Alice", "Bob", "Chris", "David", "Ellie"); 
				// Print all names 
				names.forEach(name -> System.out.println("Name: " + name)); 
				// Filter names starting with "A" 
				System.out.println("\nNames starting with A:"); 
				names.stream() 
				.filter(n -> n.startsWith("A")) 
				.forEach(System.out::println); 
				// Sort names 
				System.out.println("\nSorted Names:"); 
				names.stream() 
				.sorted() 
				.forEach(System.out::println); 

	}

}
