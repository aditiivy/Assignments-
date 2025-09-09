package iteratorstask4;
import java.util.*;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> items = new ArrayList<>();
		items.add("Alex");
		items.add("Bob");
		items.add("Charles");
		items.add("Carlos");
		items.add("Lweis");
		items.add("Norris");
		items.add("Oscar");
		
		ListIterator<String> listIterator = items.listIterator();
		
		 System.out.println("Forward Traversal:");
	        while (listIterator.hasNext()) {
	            System.out.println(listIterator.next());
	        }
	     System.out.println("\nBackward Traversal:");
	        while (listIterator.hasPrevious()) {
	            System.out.println(listIterator.previous());
	       }   

	}

}
