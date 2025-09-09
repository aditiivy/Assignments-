package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TransactionPageObj {
	
	 WebDriver driver;
	 
	 public TransactionPageObj(WebDriver driver) {
	        this.driver = driver;
	    }
	 //LOCATORS FOR TRANSACTIONS PAGE 
	    By accountDropdown = By.id("accountId"); 
	    By transactionIdInput = By.id("transactionId"); 
	    By transactionIdButton = By.xpath("//button[@id='findById']");
	    By dateInput = By.id("transactionDate");
	    By dateButton = By.xpath("//button[@id='findByDate']");
	    By fromDate = By.id("fromDate");
	    By toDate = By.id("toDate");
	    By dateRangeButton = By.xpath("//button[@id='findByDateRange']");
	    By amountInput = By.id("amount");
	    By amountButton = By.xpath("//button[@id='findByAmount']");
	    
	    public void selectAccount(String account) {
	        Select dropdown = new Select(driver.findElement(accountDropdown));
	        dropdown.selectByVisibleText(account);
	    }
	    
	    public void searchByTransactionId(String txnId) {
	        driver.findElement(transactionIdInput).clear();
	        driver.findElement(transactionIdInput).sendKeys(txnId);
	        driver.findElement(transactionIdButton).click();
	    }
	    
	    public void searchByDate(String date) {
	        driver.findElement(dateInput).clear();
	        driver.findElement(dateInput).sendKeys(date);
	        driver.findElement(dateButton).click();
	    }
	    
	    
	    public void searchByDateRange(String from, String to) {
	        driver.findElement(fromDate).clear();
	        driver.findElement(fromDate).sendKeys(from);
	        driver.findElement(toDate).clear();
	        driver.findElement(toDate).sendKeys(to);
	        driver.findElement(dateRangeButton).click();
	    }
	    
	    

	    public void searchByAmount(String amount) {
	        driver.findElement(amountInput).clear();
	        driver.findElement(amountInput).sendKeys(amount);
	        driver.findElement(amountButton).click();
	    }
	    
	    

}
