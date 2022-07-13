package GroupPractice;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class longinwithjjss {

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tek-school.com/retail/");
		
		WebElement myAccount = driver.findElement(By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[3]"));
		myAccount.click();
		WebElement longin = driver.findElement(By.xpath("//a[text()='Login']"));
		longin.click();
		WebElement email = driver.findElement(By.xpath("//input[@id='input-email']"));
		email.sendKeys("jamil.rahmani@gmail.com");
		WebElement passWord = driver.findElement(By.xpath("//input[@id='input-password']"));
		passWord.sendKeys("heythere");
		WebElement longinButton = driver.findElement(By.xpath("//input[@value='Login']"));
		longinButton.click();
		WebElement verify =driver.findElement(By.xpath("//h2[contains(text(),'My Orders')]"));
		String name = verify.getText();
		if (verify.isDisplayed()==true) {
			System.out.println(name);
			
		
		}
		else {
			System.out.println("failed go fuck your self ");
		}
		driver.close();
		
		
		
		
		}

}
