package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> grades = new ArrayList<>(Arrays.asList(85, 75, 90, 60, 88));
		Collections.sort(grades); 
		grades.remove(0); // remove lowest 
		int max = Collections.max(grades); 
		int min = Collections.min(grades); 
		int sum = 0; 
		for (int g : grades) sum += g; 
		
		System.out.println("Grades:" + grades);
		System.out.println("Max:" + max + " Min:"+min+ " Average:"+ (sum/grades.size()));

	}

}
