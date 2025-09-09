package tasks;


import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, List<Integer>> studentScores = new HashMap<>();

        // Sample data input (you can replace this with Scanner for user input)
        studentScores.put("Aditi", Arrays.asList(85, 92, 78));
        studentScores.put("Rahul", Arrays.asList(90, 88, 95));
        studentScores.put("Meena", Arrays.asList(70, 75, 72));
        studentScores.put("Karan", Arrays.asList(100, 85, 90));

        String topScorer = "";
        double highestAverage = 0.0;

        System.out.println("Student Scores & Averages:\n");

        for (Map.Entry<String, List<Integer>> entry : studentScores.entrySet()) {
            String name = entry.getKey();
            List<Integer> marks = entry.getValue();

            // Calculate average using unboxing
            int sum = 0;
            for (Integer mark : marks) {
                sum += mark; // unboxing from Integer to int
            }
            double average = (double) sum / marks.size();

            System.out.println(name + "'s marks: " + marks);
            System.out.printf("Average: %.2f\n\n", average);

            // Wrapper comparison for highest average
            if (average > highestAverage) {
                highestAverage = average;
                topScorer = name;
            }
        }

        System.out.println("🏆 Highest Scorer: " + topScorer + " with average " + highestAverage);
	}

}
