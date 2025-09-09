package app;

public class Electronics extends Product{
	
	private String brand;
    private int warrantyInMonths;

    public Electronics(String id, String name, double price, int stock, String brand, int warrantyInMonths) {
        super(id, name, price, stock);
        this.brand = brand;
        this.warrantyInMonths = warrantyInMonths;
    }
    
    @Override
    public void displayDetails() {
    	System.out.println("Electronic: "+ name + "| Brand : " +brand+ "| Warranty: " + warrantyInMonths + " months  | Price: ₹" + price + " | Stock: " + stock);
    }

}
