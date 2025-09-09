package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BillPayPage {
    WebDriver driver;
    WebDriverWait wait;

    // Locators
    By payeeName = By.name("payee.name");
    By address = By.name("payee.address.street");
    By city = By.name("payee.address.city");
    By state = By.name("payee.address.state");
    By zipCode = By.name("payee.address.zipCode");
    By phone = By.name("payee.phoneNumber");
    By account = By.name("payee.accountNumber");
    By verifyAccount = By.name("verifyAccount");
    By amount = By.name("amount");
    By fromAccount = By.name("fromAccountId");
    By sendPaymentBtn = By.xpath("//input[@value='Send Payment']");

    public BillPayPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void payBill(String name, String addr, String cityVal, String stateVal,
                        String zip, String phoneNum, String acc, String amt, String fromAcc) {

        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Bill Pay"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(payeeName)).sendKeys(name);
        driver.findElement(address).sendKeys(addr);
        driver.findElement(city).sendKeys(cityVal);
        driver.findElement(state).sendKeys(stateVal);
        driver.findElement(zipCode).sendKeys(zip);
        driver.findElement(phone).sendKeys(phoneNum);
        driver.findElement(account).sendKeys(acc);
        driver.findElement(verifyAccount).sendKeys(acc);
        driver.findElement(amount).sendKeys(amt);

        Select fromAccDropdown = new Select(driver.findElement(fromAccount));
        fromAccDropdown.selectByVisibleText(fromAcc);

        driver.findElement(sendPaymentBtn).click();
    }
}
