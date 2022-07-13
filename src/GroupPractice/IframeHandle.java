package GroupPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import basics.UtilityClass;

public class IframeHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		WebElement rigthFrame = driver.findElement(By.xpath("//iframe[@name='classFrame']"));
		driver.switchTo().frame(rigthFrame);
		Thread.sleep(3000);
		
		
		WebElement org = driver.findElement(By.xpath("//a[text()='org.openqa.selenium.chromium']"));
		org.click();
		Thread.sleep(3000);
		
		//driver.switchTo().defaultContent();
//		WebElement rigthFrame1 = driver.findElement(By.xpath("//iframe[@name='packageListFrame']"));
//		driver.switchTo().frame(rigthFrame1);
		
//		WebElement org1 = driver.findElement(By.xpath("//a[text()='org.openqa.selenium']"));
//		org1.click();
//		Thread.sleep(3000);
//		UtilityClass.screenShot(driver, "iframe2");
//		
		
	}

}
