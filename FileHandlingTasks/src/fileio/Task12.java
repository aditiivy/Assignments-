package fileio;
import java.util.Scanner;
public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text:");
		String input = sc.nextLine();
		String reversed = new StringBuilder(input).reverse().toString();
		System.out.println("Reversed: " + reversed); 
		sc.close();

	}

}
