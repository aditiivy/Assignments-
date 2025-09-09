package fileio;
import java.io.*;
public class Task9 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("task1.txt")); 
		int lines = 0, words = 0, chars = 0; 
		String line; 
		while ((line = br.readLine()) != null) { 
		lines++; 
		String[] wordList = line.split("\\s+"); 
		words += wordList.length; 
		chars += line.replace(" ", "").length(); 
		} 
		br.close(); 
		System.out.println("Lines: " + lines); 
		System.out.println("Words: " + words); 
		System.out.println("Characters (no spaces): " + chars); 

	}

}
