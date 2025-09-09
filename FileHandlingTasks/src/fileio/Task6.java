package fileio;
import java.io.*;
import java.util.Scanner;
public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("user.txt"));
			System.out.print("Enter Name: "); 
			writer.write("Name: " + sc.nextLine() + "\n");
			System.out.println("Enter email: ");
			writer.write("Email " + sc.nextLine() + "\n");
			System.out.println("Enter address: ");
			writer.write("Address " + sc.nextLine() + "\n");
			writer.close();
			System.out.println("Saved!!!!");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		sc.close();

	}

}
