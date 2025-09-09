package fileio;
import java.io.*;
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wordCount = 0;
		try {
			BufferedReader reader = new BufferedReader(new FileReader("task1.txt"));
			String line;
			while((line= reader.readLine()) != null) {
				String[] words = line.trim().split("\\s+"); 
				wordCount += words.length; 
				
			}
	
		reader.close(); 
		System.out.println("Total words: " + wordCount); 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
