package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.youtube.com/watch?v=pO0kC3YSCYo&list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx&index=5");
		Thread.sleep(5000);
		driver.navigate().back();
		
		String lastTitle = driver.getTitle();
		System.out.println("Last page title " + lastTitle);
		driver.close();
		
		
		
		
		
		
	}

}
