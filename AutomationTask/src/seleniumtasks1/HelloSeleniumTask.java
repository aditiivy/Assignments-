package seleniumtasks1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;

public class HelloSeleniumTask {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        // Type search term and press Enter
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.sendKeys(Keys.RETURN);   // hit Enter

        // Wait for search results to load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h3")));

        // Fetch all result titles
        List<WebElement> results = driver.findElements(By.cssSelector("h3"));

        System.out.println("Search Results:");
        for (WebElement result : results) {
            System.out.println(result.getText());
        }

        driver.quit();
    }
}
