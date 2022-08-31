package basics;
import java.util.List;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DynamicDropdown {
	public static void main(String[] args) {
		
		// How to handle dynamic dropdowns and calendars
		System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.aa.com/homePage.do");
		
		// I need to find locator of UI Element for Form element
		WebElement from = driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
		// We need to clear the existing value
		from.clear();
		from.sendKeys("wash");
		
		// we are storing list of elements from dropdown into a list using
		//driver.findElements method of selenium
		
		List<WebElement> fromAirports =driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		System.out.println(fromAirports.size());
		// we are writting a for each loop to iterate through list and we are writting
		// an if condition to get text of webelement from list and once condition meets
		// we will write .click method to click on element.
		for (WebElement element :fromAirports ) {
			if (element.getText().contains("IAD"))
				element.click();
		}
		
		//dynamic drop down
		WebElement to = driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
		to.clear();
		to.sendKeys("New");
	
		
		List<WebElement> toAirports = driver.findElements(By.xpath("//ul[@id='ui-id-2']/li"));
		System.out.println(toAirports.size());
		for (WebElement element :toAirports ) {
			if (element.getText().contains("JFK"))
				element.click();
		}
		
		
		WebElement numberOfPassengers = driver.findElement(By.id("flightSearchForm.adultOrSeniorPassengerCount"));
		// we will create object of Select class to handle static dropdown
		
		Select select = new Select(numberOfPassengers);
		select.selectByVisibleText("6");
		
		WebElement departureDate = driver.findElement(By.id("aa-leavingOn"));
		WebElement arrivalDate = driver.findElement(By.id("aa-returningFrom"));
		// we need to pass dates we are leaving and coming back
		// using JSExecutor we need to remember to pass proper format
		// for example if date format is mm/dd/yyyy we have to pass this format
		// if date format is mm-dd-yyyy then we have to pass this format
		String depDate = "12/16/2021";// if format was july-16 then i should pass that format
		String arrDate = "12/18/2021";
		
		// In order to automate Calendars in Selenium, one of the ways we can use
		// JavaScriptExecutor
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+depDate+"');", departureDate);
		js.executeScript("arguments[0].setAttribute('value','"+arrDate+"');", arrivalDate);
		
		WebElement search = driver.findElement(By.id("flightSearchForm.button.reSubmit"));
		search.click();
		
		
		
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
