package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sayed {

	public static void main(String[] args) {
		
	System.setProperty("WebDriver.chrome.Driver", "C:\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://tek-school.com/retail/");
	
	driver.manage().window().maximize();
	
	WebElement desktop = driver.findElement(By.xpath("//a[text()='Desktops']"));
	
	desktop.click();
	
	WebElement showAll = driver.findElement(By.xpath("(//a[@class='see-all'])[1]"));
	showAll.click();
	
	WebElement dropdwn = driver.findElement(By.id("input-sort"));
	
	Select select = new Select(dropdwn);
	
	select.selectByVisibleText("Price (High > Low)");
	
	
	
	
	
	
	
	

	}

}
