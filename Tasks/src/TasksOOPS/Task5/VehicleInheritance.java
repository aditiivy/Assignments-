package TasksOOPS.Task5;

class Vehicle{
	String brand;
    float speed;
    
    Vehicle(String brand, float speed) {
        this.brand = brand;
        this.speed = speed;
    }
    
    void showDetails() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
    
} 


class Car extends Vehicle {
    Car(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void showDetails() {
        System.out.println("Car - Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

class Bike extends Vehicle {
    Bike(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void showDetails() {
        System.out.println("Bike - Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

public class VehicleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car car = new Car("Toyota", 120);
	        Bike bike = new Bike("Yamaha", 80);

	        car.showDetails();
	        bike.showDetails();

	}

}
