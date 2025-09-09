package task5;

//Custom exception for minimum balance
class MinimumBalanceException extends Exception {
 public MinimumBalanceException(String message) {
     super(message);
 }
}

//BankingApp class with withdraw logic
class BankingApp {
 private double balance;

 public BankingApp(double initialBalance) {
     this.balance = initialBalance;
 }

 public void withdraw(double amount) throws MinimumBalanceException {
     if (balance - amount < 1000) {
         throw new MinimumBalanceException("Withdrawal denied! Balance cannot fall below ₹1000.");
     } else {
         balance -= amount;
         System.out.println("Withdrawal successful. Remaining balance: ₹" + balance);
     }
 }

 public void displayBalance() {
     System.out.println("Current balance: ₹" + balance);
 }
}

//Main class
public class RealWorldScenario {
 public static void main(String[] args) {
     BankingApp account = new BankingApp(5000);

     account.displayBalance();

     try {
         account.withdraw(3000); // Allowed
         account.withdraw(1200); // Should throw exception
     } catch (MinimumBalanceException e) {
         System.out.println("Exception: " + e.getMessage());
     }

     account.displayBalance();
 }
}

