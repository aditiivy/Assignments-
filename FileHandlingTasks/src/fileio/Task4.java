package fileio;
import java.io.*;
public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader reader = new BufferedReader(new FileReader("task1.txt"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("copy.txt"));
			String line;
			while((line = reader.readLine()) != null) {
				writer.write(line + "\n"); 

				
				 
			}
		
			reader.close(); 
			writer.close();
			System.out.println("File copied."); 
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		

	}

}
