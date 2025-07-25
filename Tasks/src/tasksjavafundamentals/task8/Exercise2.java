package tasksjavafundamentals.task8;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//pre and post increment 
		
		int x=10;
		System.out.println("x is:"+x);
		System.out.println("pre increment is ++x:"+ ++x);
		System.out.println("post increment is x++:"+ x++);
		
		// Bitwise Shift Operators
        int a = 4; // binary: 0100
        System.out.println("\nInitial a: " + a);
        System.out.println("a << 1 (left shift): " + (a << 1));  
        System.out.println("a >> 1 (right shift): " + (a >> 1)); 
        
        
        // Logical AND (&&) 
        boolean flag1= true;
        boolean flag2= false;
        boolean flag= flag1 && flag2;
        System.out.println("flag1 is " +flag1);
        System.out.println("flag2 is  " + flag2);
        System.out.println("logical and of flag1 and flag2 is "+ flag);
        
        
        // Bitwise AND (&) with integers
        int num1 = 6; // 0110
        int num2 = 3; // 0011
        int result = num1 & num2; // 0010 = 2
        System.out.println("Num1 is  " + num1 + ", and Num2 is  num2: " + num2);
        System.out.println(" Bitwise and of Num1 & Num2: " + result);
        
        

	}

}
