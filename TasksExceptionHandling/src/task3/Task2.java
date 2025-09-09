package task3;

class Vehicle {
    public final void engineType() {
        System.out.println("Generic engine");
    }
}

class Car extends Vehicle {
    // ❌ Trying to override final method will cause compile-time error
    // public void engineType() {
    //     System.out.println("Petrol engine");
    // }
    
    public void display() {
        System.out.println("Car class method");
    }
}


public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
        myCar.engineType();  // Calls the final method from Vehicle
        myCar.display();

	}

}
