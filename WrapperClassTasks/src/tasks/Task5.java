package tasks;
class Box<T>{
	T value;
	void set(T val) { 
		this.value = val; 
		} 
	T get() { 
		return value; 
	}
}

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> intBox = new Box<>(); 
		intBox.set(50); //autoboxing 
		int x = intBox.get(); //unboxing 
		Box<Double> dblBox = new Box<>(); 
		dblBox.set(99.99); 
		System.out.println("Integer Value: " + x); 
		System.out.println("Double Value: " + dblBox.get());
		

	}

}
