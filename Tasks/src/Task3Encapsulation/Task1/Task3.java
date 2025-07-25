package Task3Encapsulation.Task1;

abstract class PaymentMethod {
    abstract void pay(double amount);
}

class CreditCard extends PaymentMethod {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

class UPI extends PaymentMethod {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}

class Cash extends PaymentMethod {
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " in Cash.");
    }
}

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentMethod obj1 = new CreditCard();
        PaymentMethod obj2 = new UPI();
        PaymentMethod obj3 = new Cash();

        obj1.pay(500);
        obj2.pay(250);
        obj3.pay(100);

	}

}
