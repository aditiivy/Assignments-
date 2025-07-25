package Task3Encapsulation.Task1;

abstract class Shapes {
    abstract double area();

    void displayShapeType() {
        System.out.println("This is a shape.");
    }
}

class C extends Shapes {
    double radius;

    C(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes obj = new C(7);
        obj.displayShapeType();             // non-abstract method
        System.out.println("Area: " + obj.area());  // abstract method

	}

}
