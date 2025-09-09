package tasks;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double salary = null;
		try { 
			double net = salary + 1000; // NullPointerException 
			System.out.println("Net salary: " + net); 
			} catch (NullPointerException e) { 
			System.out.println("Salary is null. Using default value."); 
			salary = 0.0; 
			double net = salary + 1000; 
			System.out.println("Net salary: " + net); 
			} 

	}

}
