package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTestCase {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tek-school.com/retail/");
		
		WebElement myAccount = driver.findElement(By.xpath("//span[text()='My Account']"));
		myAccount.click();
		Thread.sleep(5000);
		
		WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
		register.click();
		
		//                     //span[contains(text(),'For myself')]
		//						////a[text()='Desktops']
		//                     //input[@name='Passwd']
		// Tag Xpath syntax:  //tagName[@attribute='value']
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		WebElement lastName = driver.findElement(By.id("input-lastname"));
		WebElement email = driver.findElement(By.id("input-email"));
		WebElement telephone = driver.findElement(By.id("input-telephone"));
		WebElement password = driver.findElement(By.id("input-password"));
		WebElement confirmPassword = driver.findElement(By.id("input-confirm"));
		WebElement yesToSubscription = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		WebElement privacyPolicyCheckBox = driver.findElement(By.xpath("//input[@name='agree']"));
		WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
		
		firstName.sendKeys("ahmed");
		lastName.sendKeys("khan");
		email.sendKeys("ahmedkhan12345@yahoo.com");
		telephone.sendKeys("102-332-5678");
		password.sendKeys("Anypassword");
		confirmPassword.sendKeys("Anypassword");
		
		if (!yesToSubscription.isSelected()) {
			yesToSubscription.click();
		}
		
		privacyPolicyCheckBox.click();
		Thread.sleep(3000);
		continueButton.click();
		
		
		
		
	}

}
