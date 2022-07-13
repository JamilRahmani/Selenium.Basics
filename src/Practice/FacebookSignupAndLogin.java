package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignupAndLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.webdriver", "C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/login/");
		
		WebElement createAccountButton = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createAccountButton.click();
		
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("Khan");
		WebElement lastNamw = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastNamw.sendKeys("Jan");
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("Khan1111@yahoo.com");
		Thread.sleep(3000);
		WebElement re_enterEmail = driver.findElement(By.xpath("//input[@id='u_0_r_lo']"));
		re_enterEmail.sendKeys("Khan1111@yahoo.com");
		Thread.sleep(2000);
		WebElement SingupPassword = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		SingupPassword.sendKeys("Password1$");
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.id("month"));
		Select selectMonth = new Select(month);
		selectMonth.selectByVisibleText("Oct");
		WebElement day = driver.findElement(By.id("day"));
		Select selectDay = new Select(day);
		selectDay.selectByVisibleText("1");
		WebElement year = driver.findElement(By.id("year"));
		Select selectyear = new Select(year);
		selectyear.selectByVisibleText("2002");
		WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
		gender.click();
		WebElement signupButton = driver.findElement(By.xpath("//button[@id='u_0_10_68']"));
		signupButton.click();
		
		
		
		
//		WebElement userName = driver.findElement(By.id("email"));
//		userName.sendKeys("");
//		WebElement password = driver.findElement(By.id("pass"));
//		password.sendKeys("");
//		WebElement loginButton = driver.findElement(By.xpath("//button[@id='loginbutton']"));
//		loginButton.click();
		
		driver.close();

	}

}
