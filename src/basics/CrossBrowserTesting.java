package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowserTesting {

	public static void main(String[] args) {

		WebDriver driver;
		
		String browser = "chrome";
		
		// Write a switch case to switch between browsers based on browser name:
		switch (browser) {
		case "FF":
			// for firefox we do not need to define System.setProperty. if you get exception
			// set system.SetProperty like below
			System.setProperty("webdriver.geckodriver.driver", "C:\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "ie":
			System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");// path to IEdriver.exe file
			driver = new InternetExplorerDriver();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver", "C:\\msedgedriver.exe"); // path to Edge.exe file
			driver = new EdgeDriver();
			break;
		case "headless":
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			// Create an obj of ChromeOptions and we can pass headless a parameter to
			// add.argument method
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			driver = new ChromeDriver(options);
			break;
		default:
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}
		driver.get("http://tek-school.com/retail");
		System.out.println(driver.getTitle());
		
		
		
		
		
	}

}
