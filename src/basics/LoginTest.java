package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		////input[@name='email' and @id='input-email' and @class='form-control']
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
		
		String value = email.getAttribute("id");
		System.out.println("Attribute value: "+ value);
		
		email.sendKeys("ahmedkhan12345@yahoo.com");
		password.sendKeys("Anypassword");
		Thread.sleep(5000);
		loginButton.click();
		Thread.sleep(5000);
		
		WebElement ConfirmationMessage = driver.findElement(By.xpath("//h2[text()='My Account']"));
		String text = ConfirmationMessage.getText();
		if(ConfirmationMessage.isDisplayed()==true) {
			System.out.println(text);
		}else 
			System.out.println("Test case failed");
		
		UtilityClass.screenShot(driver, "logged In");

		driver.close();
	}

}
