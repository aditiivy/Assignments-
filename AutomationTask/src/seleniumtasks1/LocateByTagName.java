package seleniumtasks1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class LocateByTagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        WebElement password = driver.findElement(By.name("password"));
        username.sendKeys("Admin");
        password.sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Wait until dashboard loads
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("a"))); // waits for at least one link

        // Find all links
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Print link text and href
        for (WebElement link : links) {
            System.out.println("Text: " + link.getText() + " | URL: " + link.getAttribute("href"));
        }

        driver.quit();


	}

}
