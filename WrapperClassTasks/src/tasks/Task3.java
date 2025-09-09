package tasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input strings
        System.out.print("Enter an integer string (e.g., 123): ");
        String intStr = sc.nextLine();

        System.out.print("Enter a double string (e.g., 45.67): ");
        String doubleStr = sc.nextLine();

        System.out.print("Enter a boolean string (e.g., true): ");
        String boolStr = sc.nextLine();

        
        int intValue = Integer.parseInt(intStr);
        double doubleValue = Double.parseDouble(doubleStr);
        boolean boolValue = Boolean.parseBoolean(boolStr);

      
        System.out.println("\nParsed values:");
        System.out.println("intValue = " + intValue + " (type: " + ((Object)intValue).getClass().getSimpleName() + ")");
        System.out.println("doubleValue = " + doubleValue + " (type: " + ((Object)doubleValue).getClass().getSimpleName() + ")");
        System.out.println("boolValue = " + boolValue + " (type: boolean – primitive)");

        sc.close();
    }
}
