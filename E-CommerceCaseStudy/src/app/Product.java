package app;

public class Product {
	
	protected String id;
    protected String name;
    protected double price;
    protected int stock;
    
    Product(String id,String name,double price, int stock){
    	this.id = id;
    	this.name = name;
    	this.price = price;
    	this.stock = stock;
    }
    
    public void displayDetails() {
	}

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void reduceStock(int quantity) {
        this.stock -= quantity;
    }

    public void restock(int quantity) {
        this.stock += quantity;
    }


}
