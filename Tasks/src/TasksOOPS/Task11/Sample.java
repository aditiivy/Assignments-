package TasksOOPS.Task11;

@FunctionalInterface 
interface MathOperation { 
int operate(int a, int b); 
} 


public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperation add = (a, b) -> a + b; 
		MathOperation sub = (a, b) -> a - b; 
		MathOperation mul = (a, b) -> a * b; 
		System.out.println("Add: " + add.operate(10, 50)); 
		System.out.println("Sub: " + sub.operate(50, 30)); 
		System.out.println("Mul: " + mul.operate(16, 2)); 

	}

}
