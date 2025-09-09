package liststask1;

import java.util.ArrayList;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> languages = new ArrayList<>();
		languages.add("Java");
        languages.add("C");
        languages.add("C++");
        languages.add("Ruby");
        languages.add("Python");
        languages.remove(1);
        System.out.println(languages);
		

	}

}
