package tasksjavafundamentals.task9;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter a positive number (-1 to exit): ");
            num = sc.nextInt();
        } while (num != -1);

        System.out.println("Program exited.");
        sc.close();

	}

}
