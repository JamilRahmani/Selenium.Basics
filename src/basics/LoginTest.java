package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tek-school.com/retail/");
		
		WebElement myAccount = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccount.click();// 
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		login.click();
		
		// Tag Xpath syntax:  //tagName[@attribute='value']
		WebElement email = driver.findElement(By.id("input-email"));
		WebElement password = driver.findElement(By.id("input-password"));
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		
		email.sendKeys("ahmedkhan12345@yahoo.com");
		password.sendKeys("Anypassword");
		Thread.sleep(5000);
		loginButton.click();
		
		WebElement ConfirmationMessage = driver.findElement(By.xpath("//h2[text()='My Account']"));
		if(ConfirmationMessage.isDisplayed()==true) {
			System.out.println("Test case passed");
		}else 
			System.out.println("Test case failed");
		
		driver.close();
	}

}
