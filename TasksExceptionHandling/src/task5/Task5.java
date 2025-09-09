package task5;


//Custom exception class
class InvalidAccountException extends Exception {
 public InvalidAccountException(String message) {
     super(message);
 }
}

//Account class to check balance
class Account {
 private double balance;

 public Account(double balance) throws InvalidAccountException {
     if (balance < 0) {
         throw new InvalidAccountException("Account balance cannot be negative.");
     }
     this.balance = balance;
 }

 public void displayBalance() {
     System.out.println("Account Balance: " + balance);
 }
}

//Main class
public class Task5 {
 public static void main(String[] args) {
     try {
         Account acc1 = new Account(5000);
         acc1.displayBalance();

         Account acc2 = new Account(-100);  // This will throw the custom exception
         acc2.displayBalance();
     } catch (InvalidAccountException e) {
         System.out.println("Exception caught: " + e.getMessage());
     }
 }
}

