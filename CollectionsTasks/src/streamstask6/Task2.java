package streamstask6;
import java.util.*;
import java.util.stream.Collectors;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n) // square each number
                .collect(Collectors.toList());

        System.out.println("Squared List: " + squaredNumbers);

	}

}
