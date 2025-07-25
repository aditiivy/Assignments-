package TasksOOPS.Task3;

class Account{
	private double balance; 
	
	public void deposit(double amount) { 
		if (amount > 0) { 
		balance += amount; 
		} 
	} 
	
	public void withdraw(double amount) { 
		if (amount <= balance) { 
		balance -= amount; 
		} 
	}
	
	public double getBalance() { 
		return balance; 
		} 
}
public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account obj1 = new Account();

		obj1.deposit(100000); 
		obj1.withdraw(30000); 
		System.out.println("Remaining Balance: ₹" + obj1.getBalance());

	}

}
