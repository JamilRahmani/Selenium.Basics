package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://tek-school.com/retail");
		
		WebElement desktop = driver.findElement(By.xpath("//a[text()='Desktops']"));
		desktop.click();
		WebElement showAllDesktop = driver.findElement(By.xpath("//a[text()='Show All Desktops']"));
		showAllDesktop.click();
		
		Thread.sleep(5000);
		
		// first we need to get WebElement of dropdown
		// second we need to create obj of Select class 
		// third we need to use one of select class methods to handle dropdown
		WebElement sortBy = driver.findElement(By.id("input-sort"));
		
		Select select = new Select(sortBy);
		select.selectByVisibleText("Price (High > Low)");
		Thread.sleep(5000);
		
//		select.selectByValue("http://tek-school.com/retail/index.php?route=product/category&path=20&sort=p.sort_order&order=ASC");
//		Thread.sleep(5000);
//		select.selectByIndex(8);
		
		
	}

}
