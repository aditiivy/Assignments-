package tasksjavafundamentals.task10;

import java.util.Scanner;

public class Task1Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[10];
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("Enter 10 integers:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];

            if (numbers[i] < min)
                min = numbers[i];

            if (numbers[i] > max)
                max = numbers[i];
        }

        double average = sum / 10.0;

        System.out.println("Average = " + average);
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);

        sc.close();

	}

}
