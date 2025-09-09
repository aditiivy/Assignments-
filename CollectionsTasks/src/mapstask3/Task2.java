package mapstask3;
import java.util.*;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "hello";
		HashMap<Character,Integer> fc = new HashMap<>();
		
		for(char ch :name.toCharArray()) {
			fc.put(ch,fc.getOrDefault(ch,0)+1);
			
			
		}
		
		System.out.println(fc);

	}

}
