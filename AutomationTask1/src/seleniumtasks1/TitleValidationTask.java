package seleniumtasks1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class TitleValidationTask {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Wait for username field to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        WebElement password = driver.findElement(By.name("password"));
        WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));

        username.sendKeys("Admin");
        password.sendKeys("admin123");
        loginBtn.click();

        // Wait until dashboard/homepage loads and title is available
        wait.until(ExpectedConditions.titleIs("OrangeHRM"));

        // Validate title
        String expectedTitle = "OrangeHRM";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title validation passed: " + actualTitle);
        } else {
            System.out.println("Title validation failed. Expected: "
                               + expectedTitle + " but got: " + actualTitle);
        }

        driver.quit();
    }
}
