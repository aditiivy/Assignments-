package seleniumtasks2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://www.google.com"); 
		WebElement searchBox = driver.findElement(By.name("q")); 
		searchBox.sendKeys("Selenium WebDriver"); 
		searchBox.submit(); 

	}

}
