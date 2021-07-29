package Practice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise3 {

	public static void main(String[] args) {


		System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://canvas.instructure.com/login/canvas");
		WebElement email = driver.findElement(By.id("pseudonym_session_unique_id"));
		WebElement password = driver.findElement(By.id("pseudonym_session_password"));
		WebElement login = driver.findElement(By.className("Button--login"));
		
		//we need to pass or enter values using.sendKeys() method
		email.sendKeys("jamil123rahmani@gmail.com");
		password.sendKeys("Jamiljan1$");
		login.click();
		
		
		
		
		
	}
	
}
