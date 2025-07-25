package TasksOOPS.Task2;


class Employee { 
	static int count = 0; 
	String name; 
	
	Employee(String name) { 
	this.name = name; 
	count++;  // increments for every object 
	} 
	
	void show() { 
	System.out.println("Employee Name: " + name); 
	} 
	
	static void showCount() { 
	System.out.println("Total Employees: " + count); 
	} 
} 
public class EmployeeCount {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Alice"); 
		Employee e2 = new Employee("Bob"); 
		e1.show(); 
		e2.show(); 
		Employee.showCount(); 

	}

}
