package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PenFed {

	public static void main(String[] args) {

		System.setProperty("WebDriver.chrome.Driver", "C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://penfed.org/");

		driver.manage().window().maximize();
		
		WebElement cookies = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		cookies.click();

		WebElement mortgage = driver.findElement(By.xpath("(//a[@class='card-product__link'])[1]"));
		mortgage.click();
		WebElement myRate = driver.findElement(By.xpath("(//a[@type='button'])[4]"));
		myRate.click();

		driver.close();

	}

}
