package streamstask6;
import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = Arrays.asList(
	            new Employee("Alice", "HR"),
	            new Employee("Bob", "IT"),
	            new Employee("Charlie", "IT"),
	            new Employee("David", "Finance"),
	            new Employee("Eve", "HR")
	        );

	        Map<String, List<Employee>> groupedByDept = employees.stream()
	                .collect(Collectors.groupingBy(e -> e.department));

	        groupedByDept.forEach((dept, empList) -> 
	            System.out.println(dept + " => " + empList)
	        );

	}

}
