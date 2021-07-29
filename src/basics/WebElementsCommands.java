package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommands {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tek-school.com/retail/");
		Thread.sleep(3000);
		
		WebElement checkOut = driver.findElement(By.id("cart"));
		checkOut.click();
		Thread.sleep(3000);
		
		WebElement currency = driver.findElement(By.id("form-currency"));
		currency.click();
		
		driver.navigate().to("https://canvas.instructure.com/login/canvas");
		WebElement email = driver.findElement(By.id("pseudonym_session_unique_id"));
		WebElement password = driver.findElement(By.id("pseudonym_session_password"));
		WebElement login = driver.findElement(By.className("Button--login"));
		
		//we need to pass or enter values using.sendKeys() method
		email.sendKeys("jamil123rahmani@gmail.com");
		password.sendKeys("Jamil");
		login.click();
		
		
		
		
		
		
	}

}
