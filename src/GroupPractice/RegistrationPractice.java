package GroupPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPractice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://tek-school.com/retail/");

		WebElement myAccount = driver.findElement(By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[3]"));
		myAccount.click();

		WebElement register = driver.findElement(By.xpath("//a[text() ='Register']"));
		register.click();

		WebElement fName = driver.findElement(By.id("input-firstname"));
		fName.click();
		fName.sendKeys("Jamil");

		WebElement lName = driver.findElement(By.id("input-lastname"));
		lName.click();
		lName.sendKeys("Rahmani");

		WebElement email = driver.findElement(By.id("input-email"));
		email.click();
		email.sendKeys("jamil.rahmani@gmail.com");

		WebElement phone = driver.findElement(By.id("input-telephone"));
		phone.click();
		phone.sendKeys("703-649-1525");
		

		WebElement pass = driver.findElement(By.id("input-password"));
		pass.click();
		pass.sendKeys("heythere");

		WebElement conPass = driver.findElement(By.id("input-confirm"));
		conPass.click();
		conPass.sendKeys("heythere");
		
		WebElement subYes = driver.findElement(By.xpath("(//input[@value='1'])[2]"));
		if(!subYes.isSelected())
		{		subYes.click();
		}
		//subYes.click();
		Thread.sleep(3000);
		WebElement agrmnt = driver.findElement(By.xpath("//input[@type='checkbox']"));
		agrmnt.click();
		Thread.sleep(3000);
		WebElement cnt = driver.findElement(By.xpath("//input[@value='Continue']"));
		cnt.click();
		
		Thread.sleep(5000);
		
		driver.close();
		
			
		

	}

}
