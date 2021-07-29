package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise4 {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tek-school.com/retail/");
		
		WebElement myAccount = driver.findElement(By.xpath("//span[text()='My Account']"));
		WebElement login = driver.findElement(By.xpath("(http://tek-school.com/retail/index.php?route=account/login"));
		WebElement email = driver.findElement(By.id("input-email"));
		WebElement password = driver.findElement(By.id("input-password"));
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));

		myAccount.click();
		login.click();
		email.sendKeys("ahmedkhan12345@yahoo.com");
		password.sendKeys("Anypassword");
		loginButton.click();
		
		
		
		
		
	}

}
