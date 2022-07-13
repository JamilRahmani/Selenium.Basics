package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import basics.UtilityClass;

public class SH {

	public static void main(String[] args) throws InterruptedException {


	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
	System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://tek-school.com/retail/");
	
	WebElement myAccount = driver.findElement(By.xpath("//a[@title='My Account']"));
	myAccount.click();
	Thread.sleep(3000);
	WebElement login = driver.findElement(By.xpath("(//a[text()='Login'])[1]"));
	login.click();
	Thread.sleep(3000);
	WebElement emailField = driver.findElement(By.id("input-email"));
	emailField.sendKeys("ahmedkhan12345@yahoo.com");
	Thread.sleep(3000);
	WebElement passwordField = driver.findElement(By.id("input-password"));
	passwordField.sendKeys("Anypassword");
	Thread.sleep(3000);
	WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
	loginButton.click();
		
		UtilityClass.screenShot(driver, "Shala");
		
		
		
		
		
	}

}
