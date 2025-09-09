package task1;

// Abstract class
abstract class Shap {
    abstract double area();  // Abstract method

    void displayShapeType() {  // Non-abstract method
        System.out.println("This is a shape.");
    }
}

// Circle subclass
class Ci extends Shap {
    double radius;

    Ci(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    void displayShapeType() {
        System.out.println("This is a Circle.");
    }
}

// Rectangle subclass
class R extends Shap{
    double length, width;

    R(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    void displayShapeType() {
        System.out.println("This is a Rectangle.");
    }
}

// Main class
public class Task2 {
    public static void main(String[] args) {
        Shap circle = new Ci(3);
        Shap rectangle = new R(4, 6);

        circle.displayShapeType();               // Calling non-abstract method
        System.out.println("Area: " + circle.area());  // Calling abstract method

        rectangle.displayShapeType();               
        System.out.println("Area: " + rectangle.area());
    }
}
