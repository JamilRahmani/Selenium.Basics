package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {

		// step 1: set system.SetProperty for chromeDriver
		// create object of chromeDriver
		System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver.exe");

		// we need to create a reference to WebDriver interface and create object of ChromeDriver.
		WebDriver driver = new ChromeDriver();
		
		// Difference between driver.get and driver.navigate
		//you can open a page with both .get() and .navigate().to()
		// .get() will wait until page is displayed
		//.navigate().to() will not wait until page is displayed
		
		driver.navigate().to("http://tek-school.com/retail/");
		Thread.sleep(5000);
		
		driver.navigate().refresh(); // this will refresh the page
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		
		
		
	}

}
