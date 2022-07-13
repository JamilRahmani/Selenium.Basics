package GroupPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GQuestion {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.webstaurantstore.com/");
		
		WebElement searchBar = driver.findElement(By.xpath("//input[@id='searchval']"));
		searchBar.sendKeys("stainless work table");// 
		
		WebElement searchButton = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		searchButton.click();
		
		List <WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		
		for (WebElement link: allLinks) {
			if (link.getText().contains("table"));
			System.out.println(link.getText().contains("table"));
		}
		
		
		
		WebElement clickOnAddToCart = driver.findElement(By.xpath("(//input[@value='Add to Cart'])[58]"));
		clickOnAddToCart.click();
		
		WebElement viewCart = driver.findElement(By.xpath("//a[text()='View Cart']"));
		viewCart.click();
		
		WebElement emptyCart = driver.findElement(By.xpath("//a[text()='Empty Cart']"));
		emptyCart.click();
		Thread.sleep(2000);
		
		WebElement confirmEmptyCart = driver.findElement(By.xpath("//button[text()='Empty Cart']"));
		confirmEmptyCart.click();		
		
	}

}
