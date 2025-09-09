package fileio;
import java.io.*;
public class Task13 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new FileReader("copy.txt")); 
		BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt")); 
		String line; 
		while ((line = br.readLine()) != null) 
		bw.write(line.replace("Java", "Python") + "\n"); 
		br.close(); 
		bw.close();
		

	}

}
