package streamstask6;
import java.util.*;
import java.util.stream.*;


public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> languages = Arrays.asList("Java", "Python", "JavaScript", "C++", "Julia", "Ruby");

        List<String> result = languages.stream()
                .filter(s -> s.startsWith("J"))
                .collect(Collectors.toList());

        System.out.println("Strings starting with J: " + result);

	}

}
