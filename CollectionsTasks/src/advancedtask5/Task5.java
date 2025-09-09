package advancedtask5;
import java.util.*;

class Learn {
    String name;
    int score;

    Learn(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " (" + score + ")";
    }
}


public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Learn> learners = Arrays.asList(
		            new Learn("Alice", 85),
		            new Learn("Bob", 92),
		            new Learn("Charlie", 78),
		            new Learn("David", 95),
		            new Learn("Eve", 88)
		        );

		        // PriorityQueue for max-heap (highest score first)
		        PriorityQueue<Learn> pq = new PriorityQueue<>(
		            (a, b) -> Integer.compare(b.score, a.score) // Descending order
		        );

		        pq.addAll(learners);

		        System.out.println("Top 3 highest scoring students:");
		        for (int i = 0; i < 3 && !pq.isEmpty(); i++) {
		            System.out.println(pq.poll());
		        }

	}

}
