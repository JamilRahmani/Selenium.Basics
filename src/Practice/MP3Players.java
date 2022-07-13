package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MP3Players {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://tek-school.com/retail");
		
		WebElement mp3Player = driver.findElement(By.xpath("//a[text()='MP3 Players']"));
		mp3Player.click();
		WebElement showAllMP3Player = driver.findElement(By.xpath("//a[text()='Show All MP3 Players']"));
		showAllMP3Player.click();
		Thread.sleep(3000);
		
		WebElement sortBy = driver.findElement(By.id("input-sort"));
		Select select = new Select(sortBy);
		select.selectByVisibleText("Rating (Highest)");
		Thread.sleep(2000);
		
		WebElement show = driver.findElement(By.id("input-limit"));
		Select select2 = new Select(show);
		select2.selectByVisibleText("100");
		
		
		
	}

}
