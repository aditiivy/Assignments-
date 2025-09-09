package seleniumtasks2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBox1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        driver.get("https://www.w3schools.com/html/html_forms.asp");
     
        driver.findElement(By.id("fname")).sendKeys("John"); 
        driver.findElement(By.id("lname")).sendKeys("Doe"); 
        driver.findElement(By.cssSelector("input[type='submit']")).click(); 
        try {
        	Thread.sleep(3000); 
			
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
        driver.quit();
	}

}
