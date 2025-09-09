package liststask1;
import java.util.*;
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> languages = Arrays.asList("Java", "C", "Java", "Python");

        // Remove duplicates using a Set
        Set<String> uniqueLanguages = new LinkedHashSet<>(languages);

        // Convert back to List if needed
        List<String> result = new ArrayList<>(uniqueLanguages);

        System.out.println("List after removing duplicates: " + result);

	}

}
