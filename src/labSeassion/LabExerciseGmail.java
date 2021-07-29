package labSeassion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LabExerciseGmail {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/AddSession/identifier?hl=en&continue=https%3A%2F%2Fmail.google.com%2Fmail&service=mail&ec=GAlAFw&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		WebElement createAccountLink = driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]"));
		WebElement createForMySelftLink = driver.findElement(By.xpath("//span[contains(text(),'For myself')]"));
		WebElement firstNameField = driver.findElement(By.xpath("//input[@name='firstName']"));
		WebElement lastNameField = driver.findElement(By.xpath("//input[@name='lastName']"));
		WebElement userNameField = driver.findElement(By.xpath("//input[@type='email']"));
		WebElement passwordField = driver.findElement(By.xpath("//input[@name='Passwd']"));
		WebElement confirmPasswordField = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		WebElement nextButton = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		
		
		createAccountLink.click();
		createForMySelftLink.click();
		firstNameField.sendKeys("Test Name for Gmail");
		lastNameField.sendKeys("Any Last Name");
		userNameField.sendKeys("testUserName");
		passwordField.sendKeys("AnyPassword");
		confirmPasswordField.sendKeys("AnyPassword");
		checkBox.click();
		nextButton.click();

	}

}
