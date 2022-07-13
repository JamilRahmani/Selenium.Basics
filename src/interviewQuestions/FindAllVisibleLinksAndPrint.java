package interviewQuestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllVisibleLinksAndPrint {

	public static void main(String[] args) {

		System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		 WebElement searchkey = driver.findElement(By.xpath("//input[@type='text']"));
		 searchkey.sendKeys("selenium");
		 
		 WebElement sele = driver.findElement(By.xpath("(//span[text()='selenium'])[1]"));
		 sele.click();
		 
		 
		 List<WebElement> allLinks = driver.findElements(By.tagName("h3"));
		 
			for (WebElement element :allLinks ) {

				System.out.println("Title : "+element.getText());
					
			}
		 
		 
		 
		 
	}

}
