package tasks;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = 100;
		Integer b = 100;
		
		Integer c = new Integer(100);
		Integer d = new Integer(100);
		
		System.out.println("Autoboxed Integers:");
        System.out.println("a == b: " + (a == b));           // same cached 
        System.out.println("a.equals(b) :" + a.equals(b));        // compares values only 

        System.out.println("\nNew Integers:");
        System.out.println("c == d : " + (c == d));           // 2 different objects with different references 
        System.out.println("c.equals(d) : " + c.equals(d));        // true because value is compared

        System.out.println("\nMixed Comparison:");
        System.out.println("a == c : " + (a == c));           // false because a is cached autobox , c is just an obj
        System.out.println("a.equals(c) : " + a.equals(c));   //value is same so true 
		

	}

}
