package fileio;
import java.io.*;
public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
			BufferedReader reader = new BufferedReader(new 
			FileReader("nofile.txt")); 
			reader.readLine(); 
			} catch (FileNotFoundException e) { 
			System.out.println("File not found. Please check the file name."); 
			} catch (IOException e) { 
			e.printStackTrace(); 
			} 

	}

}
