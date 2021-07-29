package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		WebElement packageListFrame = driver.findElement(By.xpath("//iframe[@name ='packageListFrame']"));
		driver.switchTo().frame(packageListFrame);
		
		String value =driver.findElement(By.xpath("//a[text()='org.openqa.selenium' and @target = 'packageFrame']")).getText();
		System.out.println(value);
		
		
		
		
	}

}
