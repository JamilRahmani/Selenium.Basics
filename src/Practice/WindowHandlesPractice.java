package Practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import basics.UtilityClass;

public class WindowHandlesPractice {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://ksrtc.in/oprs-web/");
		System.out.println(driver.getTitle());
		UtilityClass.screenShot(driver, "WindowHandlesPractice");
		
		WebElement appStore =driver.findElement(By.xpath("//p[text()='App Store']"));
		appStore.click();
		
		Set <String> handle = driver.getWindowHandles();
		
		Iterator <String> iterator = handle.iterator();
		
		String parentWindow = iterator.next();
		
		String childWindow = iterator.next();
		
		driver.switchTo().window(childWindow);
		
		WebElement find = driver.findElement(By.id("ember101"));
		find.isDisplayed();
		UtilityClass.screenShot(driver, "ChildLogo");
		
		driver.quit();
		
		
		
	}

}
