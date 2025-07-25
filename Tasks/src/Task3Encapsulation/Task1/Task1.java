package Task3Encapsulation.Task1;

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double area() {
        return length * width;
    }
}

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape obj1 = new Circle(5.8);
        Shape obj2 = new Rectangle(42, 36);
        System.out.println("Circle area: " + obj1.area());
        System.out.println("Rectangle area: " + obj2.area());

	}

}
