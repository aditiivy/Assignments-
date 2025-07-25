package tasksjavafundamentals.task9;

import java.util.Scanner;



public class MenuDrivenCalc {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculator menu : Choose an option (1-4):");
		System.out.println("1.Add");
		System.out.println("2.Subtract");
		System.out.println("3.Multiply");
		System.out.println("4.Divide");
		int choice = sc.nextInt();
		
		System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Sum: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Difference: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Product: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0)
                    System.out.println("Quotient: " + (num1 / num2));
                else
                    System.out.println("Error: Cannot divide by zero.");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
		
	}

}
