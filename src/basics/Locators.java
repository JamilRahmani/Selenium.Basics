package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tek-school.com/retail/");
		
		// find a WebElement by ID 
		WebElement currency = driver.findElement(By.id("form-currency"));
		System.out.println(currency.isDisplayed()); // it validates if element is displayed.
		
		// find a webElement by name
		WebElement search = driver.findElement(By.name("search"));
		search.sendKeys("iphone");// it will send a value to input box or enter value
		Thread.sleep(5000);
		
		// find a webelment by linkText it usually starts with "a" tag 
		WebElement testEnvironment = driver.findElement(By.linkText("TEST ENVIRONMENT"));
		System.out.println(testEnvironment.isDisplayed());
		
		// Xpath: 
		//1. Absolute Xpath-- starts with single slash, starts from top of HTML dom 
		//Syntax for absolute /html/body/dev/tagname
		//2. Relative Xpath --Starts with double slash, starts from tag of that dom element. 
		// syntax for relative xpath : //tagname[@attribute ='value']
		WebElement searchBar =driver.findElement(By.xpath("//input[@name='search']"));
		searchBar.clear();
		Thread.sleep(5000);
		
		// CssSelector: syntax tagname[attribute=value]
		WebElement searchBarByCssSelector = driver.findElement(By.cssSelector("input[name='search']"));
		searchBarByCssSelector.sendKeys("Computer");
		
		
		
		
		
		
		
		
	}

}
