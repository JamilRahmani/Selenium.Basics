package basics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://ksrtc.in/oprs-web/");
		System.out.println(driver.getTitle());
		UtilityClass.screenShot(driver, "ParentWindow");
		
		WebElement crm = driver.findElement(By.xpath("//p[text()='CRM']"));
		crm.click();
		
		// we need to use driver.WindowHandles to get WindowHandles of these tabs
		Set <String> handles = driver.getWindowHandles();
		
		// we need to create an iterator from collection family to iterate through
		// Set and we will use. next method to get parent and child window Handle.
		Iterator <String> iterator = handles.iterator();
		
		// we need to get parent window handle
		String parentWindowID = iterator.next();
		System.out.println("Parent Window ID is "+ parentWindowID);
		
		String childWindowID = iterator.next();
		System.out.println("Child Window ID is "+ childWindowID);
		
		//in selenium in order to switch from one window to another we need to 
		// use driver.switchTo().window();
		driver.switchTo().window(childWindowID);
		System.out.println("Child window Title "+driver.getTitle());
		
		WebElement search = driver.findElement(By.id("support-search-input"));
		search.sendKeys("Book");
		UtilityClass.screenShot(driver, "ChildWindow");
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
