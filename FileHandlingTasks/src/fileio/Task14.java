package fileio;
import java.io.*;

public class Task14 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("merge.txt"));
		BufferedReader br1 = new BufferedReader(new FileReader("output.txt")); 
		BufferedReader br2 = new BufferedReader(new FileReader("copy.txt")); 
		String line; 
		while ((line = br1.readLine()) != null) bw.write(line + "\n"); 
		while ((line = br2.readLine()) != null) bw.write(line + "\n"); 
		br1.close(); br2.close(); bw.close();
		

	}

}
