package interviewQuestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinksAndGetTheText {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://tek-school.com/retail");
		
		// to print all links in this page.
		// we need to use findelements() method
		// we need to store them in list
		// we need to iterate through each index of list and get its text.
		
		List <WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		
		for (WebElement link: allLinks) {
			System.out.println(link.getText());
		}
		
		
		
		WebElement desktop = driver.findElement(By.xpath("//a[text()='Desktops']"));
		System.out.println(desktop.getText());
		desktop.click();
		
		
		
		
	}

}
