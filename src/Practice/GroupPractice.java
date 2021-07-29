package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupPractice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.Driver", "C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("http://tek-school.com/retail/");
		
		driver.manage().window().maximize();
		
		String title = 	driver.getTitle();
		
		System.out.println(title);
		
		
		
		WebElement myaccnt = driver.findElement(By.xpath("//span[text()='My Account']"));
		myaccnt.click();
		
		Thread.sleep(3000);
		
		WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
		register.click();
		
		
		WebElement fName = driver.findElement(By.id("input-firstname"));
		fName.sendKeys("Abdul");
		
		WebElement lName = driver.findElement(By.id("input-lastname"));
		lName.sendKeys("Faizi");
		
		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys("123@gmail.com");
		
		WebElement phone = driver.findElement(By.xpath("//input[@name='telephone']"));
		phone.sendKeys("703-535-2121");
		 
		WebElement pass = driver.findElement(By.id("input-password"));
		pass.sendKeys("1234123");
		
		WebElement cPass  = driver.findElement(By.name("confirm"));
		cPass.sendKeys("1234123");
		
		WebElement btn = driver.findElement(By.xpath("(//input[@name='newsletter'])[1]"));
		btn.click();
		
		WebElement agree = driver.findElement(By.xpath("//input[@name='agree']"));
		agree.click();
		
		WebElement sbmt = driver.findElement(By.xpath("//input[@type='submit']"));
		sbmt.click();
		
	}

}
