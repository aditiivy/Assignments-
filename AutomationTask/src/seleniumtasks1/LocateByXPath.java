package seleniumtasks1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocateByXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        WebElement password = driver.findElement(By.name("password"));
        username.sendKeys("Admin");
        password.sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        try {
            WebElement adminMenu = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[text()='Admin']")
            ));
            adminMenu.click();
            System.out.println("Admin menu located and clicked successfully!");
        } catch (Exception e) {
            System.out.println("Failed to locate Admin menu: " + e.getMessage());
        }
        driver.quit();

	}

}
