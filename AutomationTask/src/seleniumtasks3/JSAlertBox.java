package seleniumtasks3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlertBox {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://theinternet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//task--print alert text and accept it 
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Alert alert1 = driver.switchTo().alert();
        System.out.println("Alert text is: " + alert1.getText());  // Print alert text
        alert1.accept();  
        Thread.sleep(1000);
        
        //task-----verify result
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Alert alert2 = driver.switchTo().alert();
        alert2.dismiss();  
        String confirmResult = driver.findElement(By.id("result")).getText();
        System.out.println("Confirm result: " + confirmResult);
        Thread.sleep(1000);
        
        //handle js prompt
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("Aditi Dash"); 
        alert3.accept();  
        String promptResult = driver.findElement(By.id("result")).getText();
        System.out.println("Prompt result: " + promptResult);
        
        driver.quit();

	}

}
