package advancedtask5;
import java.util.*;
import java.util.stream.Collectors;
class Learner {
    String id;
    String name;

    Learner(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Learner{id='" + id + "', name='" + name + "'}";
    }
}

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Learner> learners = new ArrayList<>();
        learners.add(new Learner("S01", "Alice"));
        learners.add(new Learner("S02", "Bob"));
        learners.add(new Learner("S03", "Charlie"));

        // Convert List<Learner> to Map<String, Learner> using ID as key
        Map<String, Learner> learnerMap = learners.stream()
            .collect(Collectors.toMap(l -> l.id, l -> l));

        // Print the map
        for (String id : learnerMap.keySet()) {
            System.out.println(id + " => " + learnerMap.get(id));
        }

	}

}
