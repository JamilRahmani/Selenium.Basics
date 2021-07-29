package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingAndAuthoPopUp {

	public static void main(String[] args) {

		
		// Alert Hanlding we need to use Switchto().Alert().accept() 
		
		System.setProperty("webdriver.chrome.driver", "C:\\msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://ksrtc.in");
		
		WebElement search = driver.findElement(By.xpath("//button[contains(text(),'Search')]"));
		search.click();
		
		String alertMessage =driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		
		driver.switchTo().alert().accept();
		
	// Now we can handle Authentication Popup with using below sytanx:
	//http://{userName}:{password}@url
		
		String userName = "admin";
		String password = "admin";
		//String url = "http://the-internet.herokuapp.com/basic_auth";
		String authenticatedURL = "http://"+userName+":"+password+"@"+"the-internet.herokuapp.com/basic_auth";
		
		driver.navigate().to(authenticatedURL);
		//driver.get(authenticatedURL);

	

		
	}

}
