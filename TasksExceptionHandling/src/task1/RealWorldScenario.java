package task1;

//Abstract class
abstract class PaymentMethod {
 abstract void pay(double amount);  // Abstract method
}

//CreditCard class
class CreditCard extends PaymentMethod {
 String cardNumber;

 CreditCard(String cardNumber) {
     this.cardNumber = cardNumber;
 }

 @Override
 void pay(double amount) {
     System.out.println("Paid ₹" + amount + " using Credit Card: " + cardNumber);
 }
}

//UPI class
class UPI extends PaymentMethod {
 String upiId;

 UPI(String upiId) {
     this.upiId = upiId;
 }

 @Override
 void pay(double amount) {
     System.out.println("Paid ₹" + amount + " using UPI ID: " + upiId);
 }
}

//Cash class
class Cash extends PaymentMethod {
 @Override
 void pay(double amount) {
     System.out.println("Paid ₹" + amount + " in Cash.");
 }
}

//Main class
public class RealWorldScenario {
 public static void main(String[] args) {
     PaymentMethod method1 = new CreditCard("1234-5678-9012");
     PaymentMethod method2 = new UPI("aditi@upi");
     PaymentMethod method3 = new Cash();

     method1.pay(250.00);
     method2.pay(100.00);
     method3.pay(50.00);
 }
}
