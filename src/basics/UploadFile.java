package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {


		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://xndev.com/display-image/");
		
		// we need to get locator of upload button
		// we need to provide path to file which we uploading
		WebElement upload = driver.findElement(By.xpath("//input[@type='file']"));
		String fileLocation = "C:\\Users\\MSelk\\OneDrive\\Desktop\\Java WS\\Selenium.basics\\output\\ChildWindow.png";
		upload.sendKeys(fileLocation);
		
		
		
		
	}

}
