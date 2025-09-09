package advancedtask5;
import java.util.*;

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
		List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "HR"));
        employees.add(new Employee("Bob", "IT"));
        employees.add(new Employee("Charlie", "HR"));
        employees.add(new Employee("David", "Finance"));
        employees.add(new Employee("Eve", "IT"));

        Map<String, List<Employee>> departmentMap = new HashMap<>();
        
        for (Employee e : employees) {
            departmentMap
                .computeIfAbsent(e.department, k -> new ArrayList<>())
                .add(e);
        }

        // Print grouped employees
        for (String dept : departmentMap.keySet()) {
            System.out.println(dept + ": " + departmentMap.get(dept));
        }

	}

}
