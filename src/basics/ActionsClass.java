package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://tek-school.com/retail");
		
		WebElement desktop = driver.findElement(By.xpath("//a[text()='Desktops']"));
		
		Actions action = new Actions(driver);
		// mouse over to an element
		action.moveToElement(desktop).build().perform();
		Thread.sleep(3000);
		// right click on UI
		//action.contextClick(desktop).build().perform();
		// double click -- it has 2 options to perform
		WebElement myAccount = driver.findElement(By.xpath("//span[text()='My Account']"));
		action.doubleClick(myAccount).build().perform();
		Thread.sleep(3000);
		
		driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
		
		// for drag and drop we need two things:
		//1. source WebElement
		//2. Target WebElement
		
		
		WebElement source = driver.findElement(By.xpath("(//li[@id='fourth']/a)[1]"));
		WebElement target = driver.findElement(By.xpath("//ol[@id='amt7']"));
		
		action.dragAndDrop(source, target).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
