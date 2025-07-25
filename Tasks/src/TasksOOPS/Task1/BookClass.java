package TasksOOPS.Task1;


class Book{
	String title; 
	String author; 
	double price; 
	
	void displayDetails() { 
		System.out.println("Title: " + title); 
		System.out.println("Author: " + author); 
		System.out.println("Price: ₹" + price); 
		} 
}
public class BookClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //	Creating 2 new book objects 	
		Book obj1 = new Book();
		obj1.title= "To kill a Mocking Bird";
		obj1.author= "Harper Lee";
		obj1.price = 399.00;
		
	
		Book obj2 = new Book();
		obj2.title= "Harry Potter & the Philosopher's Stone";
		obj2.author= "JK Rowling";
		obj2.price = 450.00;
		
		
		obj1.displayDetails(); 
		obj2.displayDetails(); 
		
		
		
		
		
		

	}

}
