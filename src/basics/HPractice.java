package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HPractice {

	public static void main(String[] args) {


		System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://tek-school.com/ecommerce/index.php?route=account/login");
		
		WebElement email = driver.findElement(By.id("input-email"));
		WebElement password = driver.findElement(By.id("input-password"));
		WebElement login = driver.findElement(By.className("btn-primary"));
		
		email.sendKeys("jamil123rahmani@yahoo.com");
		password.sendKeys("Jamiljan1");
		login.click();
		UtilityClass.screenShot(driver, "ecommerce");
		
	}

}
