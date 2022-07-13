package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframePractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		WebElement packageListFrame1 = driver.findElement(By.xpath("//iframe[@name ='packageListFrame']"));
		driver.switchTo().frame(packageListFrame1);
		
		WebElement firstClick = driver.findElement(By.xpath("(//a[@target='packageFrame'])[2]"));
		firstClick.click();
		
		driver.switchTo().defaultContent();
		
		WebElement packageListFrame2 = driver.findElement(By.xpath("//iframe[@name='classFrame']"));
		driver.switchTo().frame(packageListFrame2);
		
		WebElement secondClick = driver.findElement(By.xpath("//a[contains(text(),'org.openqa.selenium.cli')]"));
		secondClick.click();
		
		
		
	}

}
