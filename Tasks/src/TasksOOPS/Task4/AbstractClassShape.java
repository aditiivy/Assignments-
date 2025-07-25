package TasksOOPS.Task4;

abstract class Area{
	abstract double area();
	
}
class Circle extends Area{
	double radius;
	
	Circle(double r){
		radius = r;
	}
	double area() { 
		return Math.PI * radius * radius; 
		}
}

class Rectangle extends Area{
	double length, width; 
	
	Rectangle(double l, double w) { 
		length = l; 
		width = w; 
	} 
	
	double area() { 
		return length * width; 
		} 
}
public class AbstractClassShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area obj1 = new Circle(5);
		Area obj2 = new Rectangle(4,9);
		
		System.out.println("Area of circle is : " + obj1.area());
		System.out.println("Area of rectangle is : " + obj2.area());
		

	}

}
