package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeHandling {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		WebElement packageListFrame = driver.findElement(By.xpath("//iframe[@name ='packageListFrame']"));
		driver.switchTo().frame(packageListFrame);
		
		WebElement clik = driver.findElement(By.xpath("//a[text()='org.openqa.selenium']"));
		clik.click();
		
		String value =driver.findElement(By.xpath("//a[text()='org.openqa.selenium' and @target = 'packageFrame']")).getText();
		System.out.println(value);
		
		// When ever we want to switch from one frame to another, First we need to  switch to
		//defaultcontent then we can go to the next frame. Below is the method
		driver.switchTo().defaultContent();
		
		WebElement packageListFrame1 = driver.findElement(By.xpath("//iframe[@title='Package, class and interface descriptions']"));
		driver.switchTo().frame(packageListFrame1);
		//driver.switchTo().alert().accept();
		
		WebElement clik2 = driver.findElement(By.xpath("//a[text()='org.openqa.selenium']"));
		clik2.click();
		
		
		
		
		
		
		
	}

}
