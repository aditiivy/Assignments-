package fileio;
import java.io.*;
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedWriter writer = new BufferedWriter((new FileWriter("task1.txt",true)));
			writer.write("Java I/O is powerful!\n"); 
			writer.write("Learn Java step-by-step\n"); 
			writer.close(); 
			System.out.println("File written successfully."); 
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
