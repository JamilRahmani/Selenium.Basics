package basics;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser {
	
	public static void main(String[] args) {
		
		
		// Step 1: we need to open chrome browser 
		// Step 2: we need to lunch www.tekschool.us website 
		// we need to define System.setProperty 
		// for windows :"WebDriver.chrome.driver", "C:\\chromedriver.exe"
		// for mac: "WebDriver.chrome.driver", "chromedriver"
		// path should be like this rootfolder\\folder\\folder\\chromedriver.exe
		// System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver.exe");
		
		
		// we need to create a reference to WebDriver interface and create object of ChromeDriver. 
		WebDriver driver = WebDriverManager.chromedriver().create();
		
		
		// we need to set some properties 
		// This line of code will open chrome browser to maximum size. 
		driver.manage().window().maximize();
		//we need to tell the driver to wait for certain amount of time so web page is loaded
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		// cookies?
		//driver.manage().deleteAllCookies();
		
		// we need to lunch tekschool.us website https://tekschool.us/
		driver.get("http://tek-school.com/retail/"); // http://tek-school.com/retail/
		//to get page title we use below method
		String title = driver.getTitle();
		System.out.println("page title is  "+ title);
		// we can validate the current URL
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL " + currentURL);
		
		// in order to close the browser we have two methods. 
		// driver.close() :-- this method will close only recent tab opened by selenium 
		//driver.quit():-- this method will close all tabs opened by selenium. 
		driver.close();
		
		
		
		
	}
}