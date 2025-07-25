package tasksjavafundamentals.task11;

import java.util.Scanner;


public class Task1StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // Accept input string
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        // Length
	        System.out.println("Length: " + input.length());

	        //uppercase
	        System.out.println("Uppercase: " + input.toUpperCase());

	        // Lowercase
	        System.out.println("Lowercase: " + input.toLowerCase());

	        // Substring (first 3 characters if length permits)
	        if (input.length() >= 3) {
	            System.out.println("Substring (0 to 3): " + input.substring(0, 3));
	        } else {
	            System.out.println("Substring: Not enough characters.");
	        }

	        // Index of a character
	        System.out.print("Enter a character to find index of: ");
	        char ch = sc.next().charAt(0);
	        int index = input.indexOf(ch);

	        if (index != -1) {
	            System.out.println("Index of '" + ch + "': " + index);
	        } else {
	            System.out.println("'" + ch + "' not found in the string.");
	        }

	        sc.close();

	}

}
