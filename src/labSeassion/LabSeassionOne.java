package labSeassion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LabSeassionOne {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// url for the website (Amazon)
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		WebElement signInLink = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		WebElement signin = driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
		WebElement createAccountSubmit = driver.findElement(By.xpath("//a[contains(text(),'Create your Amazon')]"));
		WebElement enterNameField = driver.findElement(By.xpath("//input[@name='customerName']"));
		WebElement emailField = driver.findElement(By.xpath("//input[@type='email']"));
		WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement confirmPasswordField = driver.findElement(By.id("ap_password_check"));
		WebElement continueButton = driver.findElement(By.id("continue"));
		
		signInLink.isSelected();
		signin.click();
		createAccountSubmit.click();
		enterNameField.sendKeys("Test amazon");
		emailField.sendKeys("testemail123@gmail.com");
		passwordField.sendKeys("NoPassword123");
		confirmPasswordField.sendKeys("NoPassword123");
		continueButton.click();
		//driver.close();	

		
	}

}
