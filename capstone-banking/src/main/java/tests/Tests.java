package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

import utilities.ExcelUtilities;
import pages.TransactionPageObj;
import pages.BillPayPage;
import com.aventstack.extentreports.*;
import utilities.ExtentUtilities;
public class Tests {
	
	WebDriver driver;
	WebDriverWait wait;
    ExcelUtilities loanExcel;
    ExcelUtilities loginExcel;
    ExcelUtilities transferExcel;
    ExtentReports extent;
    ExtentTest test;
    
	@BeforeTest
	public void setup(){
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		 driver.get("https://parabank.parasoft.com");
		 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 

		 extent = ExtentUtilities.getInstance();

		 try {
			 loanExcel = new ExcelUtilities("src/main/resources/LoanData.xlsx","Sheet1");
	         loginExcel = new ExcelUtilities("src/main/resources/LoginData.xlsx","Sheet1");
	         transferExcel = new ExcelUtilities("src/main/resources/FundsTransfer.xlsx","Sheet1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
	}
	

	
	@Test(priority=1)
	public void Login() {
		test = extent.createTest("Login Test");    

		String username = loginExcel.getCellData(1, 0);
        String password = loginExcel.getCellData(1, 1);
        
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        WebElement title = driver.findElement(By.xpath("//*[@id=\"showOverview\"]/h1"));
        Assert.assertEquals(title.getText(), "Accounts Overview");
        
        test.pass("Login successful and Accounts Overview displayed.");
		
	}
	
	@Test(priority=2)
	public void loanApplicationTest() {
		test = extent.createTest("Loan Approve Test"); 
		 String loanAmount = loanExcel.getCellData(1, 0);
		    String downPayment = loanExcel.getCellData(1, 1);
		    String fromAccount = loanExcel.getCellData(1, 2);

		    // Click Request Loan
		    WebElement requestLoanLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Request Loan")));
		    requestLoanLink.click();

		    // Fill loan form
		    WebElement amountField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("amount")));
		    amountField.clear();
		    amountField.sendKeys(loanAmount);

		    WebElement downPaymentField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("downPayment")));
		    downPaymentField.clear();
		    downPaymentField.sendKeys(downPayment);

		    // Select account from dropdown
		    Select accountDropdown = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.id("fromAccountId"))));
		    accountDropdown.selectByVisibleText(fromAccount);

		    // Submit loan application
		    driver.findElement(By.xpath("//input[@value='Apply Now']")).click();

		    // Wait for status to appear
		    WebElement status = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loanStatus")));
		    System.out.println("Loan Status: " + status.getText());
		    
		    test.pass("Funds transfer successful.");
	}

		
		
		
	
	
	
	@Test(priority=3)
	public void loanAppovalReject() {
		test = extent.createTest("Loan Reject Test"); 
		String loanAmount = "1000000000"; 
	    String downPayment = "10000000"; 
	    String fromAccount = "18117"; 

	    // Click Request Loan
	    WebElement requestLoanLink = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Request Loan")));
	    requestLoanLink.click();

	    // Fill loan form
	    WebElement amountField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("amount")));
	    amountField.clear();
	    amountField.sendKeys(loanAmount);

	    WebElement downPaymentField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("downPayment")));
	    downPaymentField.clear();
	    downPaymentField.sendKeys(downPayment);

	    // Select account from dropdown
	    Select accountDropdown = new Select(wait.until(ExpectedConditions.elementToBeClickable(By.id("fromAccountId"))));
	    accountDropdown.selectByVisibleText(fromAccount);
	    // Submit loan application
	    driver.findElement(By.xpath("//input[@value='Apply Now']")).click();

	    // Wait for status to appear (optional)
	    try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }

	    // Get status text
	    String statusText = driver.findElement(By.id("loanStatus")).getText();
	    System.out.println("Loan Status: " + statusText);

	    // Assert Denied for this Excel row
	    Assert.assertEquals(statusText, "Denied");
	    test.pass("Funds transfer unsuccessful.");
	}
	
	

	
	@Test(priority=4)
	public void fundsTransfer() {
		test = extent.createTest("Funds Transfer Test"); 
		String fromAccount = transferExcel.getCellData(1, 0);
        String toAccount = transferExcel.getCellData(1, 1);
        String amount = transferExcel.getCellData(1, 2);

        // Click Transfer Funds link
        WebElement transferLink = wait.until(ExpectedConditions.elementToBeClickable(
                By.linkText("Transfer Funds")
        ));
        transferLink.click();

        // Fill transfer form
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("amount"))).sendKeys(amount);
        Select fromDropdown = new Select(driver.findElement(By.id("fromAccountId")));
        fromDropdown.selectByVisibleText(fromAccount);
        Select toDropdown = new Select(driver.findElement(By.id("toAccountId")));
        toDropdown.selectByVisibleText(toAccount);

        // Submit transfer
        driver.findElement(By.xpath("//input[@value='Transfer']")).click();

        // Wait for success message
        WebElement success = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h1[contains(text(),'Transfer Complete!')]")
        ));
        String successMsg = success.getText();
        System.out.println("Transfer Message: " + successMsg);
        Assert.assertEquals(successMsg, "Transfer Complete!", "Funds transfer failed!");
		
	}
	
	
	@Test(priority=5)
	public void transctionHistory() {
		test = extent.createTest("check transactions Test"); 
		driver.findElement(By.linkText("Find Transactions")).click();
	    TransactionPageObj th = new TransactionPageObj(driver);

	    // Search by Transaction ID
	    Select fromDropdown = new Select(driver.findElement(By.id("accountId")));
	    fromDropdown.selectByIndex(0);

	   

	    th.searchByTransactionId("15808");
	    Assert.assertTrue(driver.getPageSource().contains("Transaction"), 
	                     "Transaction ID search result not found");

	    // Search by Date
	    driver.findElement(By.linkText("Find Transactions")).click(); // reload page
	    th.searchByDate("01-09-2025");
	    Assert.assertTrue(driver.getPageSource().contains("Transaction"), 
	                     "Date search result not found");

	    // Search by Date Range
	    driver.findElement(By.linkText("Find Transactions")).click(); // reload page
	    th.searchByDateRange("01-09-2025", "03-09-2025");
	    Assert.assertTrue(driver.getPageSource().contains("Transaction"), 
	                     "Date range search result not found");

	    // Search by Amount
	    driver.findElement(By.linkText("Find Transactions")).click(); // reload page
	    th.searchByAmount("100");
	    Assert.assertTrue(driver.getPageSource().contains("Transaction"), 
	                     "Amount search result not found");
	    
	    test.pass("Transaction successful.");
		
		
	}
	
	@Test(priority=6)
	public void billPayTest() {
		test = extent.createTest("bill payment Test"); 
		BillPayPage bill = new BillPayPage(driver);
		bill.payBill(
		        "Olive Smith", 
		        "123 Main Street", 
		        "New York", 
		        "NY", 
		        "10001", 
		        "16230", 
		        "16230", 
		        "500", 
		        "17895"  
		    );

		    // Assertion
		    WebElement successMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(
		            By.xpath("//h1[text()='Bill Payment Complete']")));
		    Assert.assertEquals(successMsg.getText(), "Bill Payment Complete");
		    test.pass("bill payment successful.");
	}
	
	@AfterTest
	public void teardown() {
		
		    if (driver != null) {
		        driver.quit();
		    
		}
		    extent.flush();
	}

}
