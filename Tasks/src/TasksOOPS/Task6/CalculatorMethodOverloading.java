package TasksOOPS.Task6;

class Calculator { 
int add(int a, int b) { 
return a + b; 
} 
double add(double a, double b) { 
return a + b; 
} 
String add(String a, String b) { 
return a + b; 
} 
}

public class CalculatorMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj = new Calculator(); 
		System.out.println("Int Add: " + obj.add(2, 3)); 
		System.out.println("Double Add: " + obj.add(24.8, 3.9)); 
		System.out.println("String Add: " + obj.add("Good ", "Morning")); 

	}

}
