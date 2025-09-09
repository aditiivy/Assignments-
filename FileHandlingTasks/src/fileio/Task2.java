package fileio;
import java.io.*;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader reader = new BufferedReader(new FileReader("task1.txt"));
			String line; 
			while ((line = reader.readLine()) != null) 
			System.out.println(line); 
			reader.close(); 
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
