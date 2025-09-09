package tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> list = new ArrayList<>();
		 Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 double values to list-");
		for (int i = 1; i <= 5; i++) {
			double val = sc.nextDouble();
            list.add(val);
        }
		double sum = 0;
		for(Double value:list) {
			sum+= value;
			}
		double average = sum / list.size();
        System.out.println("Average: " + average);
		

	}

}
