package mapstask3;
import java.util.*;
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(105, "Alice");
        hashMap.put(101, "Bob");
        hashMap.put(103, "Charlie");
        hashMap.put(102, "David");
        hashMap.put(104, "Eve");

        System.out.println("Unsorted HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Sorted TreeMap by keys
        Map<Integer, String> treeMap = new TreeMap<>(hashMap);

        System.out.println("\nSorted TreeMap by keys:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        

	}

}
