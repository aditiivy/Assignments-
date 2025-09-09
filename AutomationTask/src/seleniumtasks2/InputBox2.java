package seleniumtasks2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class InputBox2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Step 1: Open the W3Schools forms page
        driver.get("https://www.w3schools.com/html/html_forms.asp"); 
        driver.findElement(By.id("fname")).sendKeys("John"); 
        driver.findElement(By.id("lname")).sendKeys("Doe"); 
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        WebElement firstName = driver.findElement(By.id("fname")); 
        firstName.clear(); 
        firstName.sendKeys("Jane"); 
        
        driver.quit();

	}

}
