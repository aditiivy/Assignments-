package tasks;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		Integer iObj = Integer.valueOf(i);
		double d = 34.4f;
		Double dObj = Double.valueOf(d);
		char c = 'c';
		Character cObj = Character.valueOf(c);
		
		System.out.println("Printing as wrapper class objects--");
		System.out.println(iObj);
		System.out.println(dObj);
		System.out.println(cObj);
		
		
		int m = iObj.intValue();
		double n = dObj.doubleValue();
		char ch = cObj.charValue();
		
		System.out.println("Now printing as primitive values:");
		System.out.println(m);
		System.out.println(n);
		System.out.println(ch);
		
		

	}

}
