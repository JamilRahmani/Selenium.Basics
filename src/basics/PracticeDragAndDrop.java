package basics;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeDragAndDrop {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		Actions action = new Actions(driver);
		// USA DragAndDrop
		WebElement source = driver.findElement(By.id("box3"));
		WebElement target = driver.findElement(By.id("box103"));
		action.dragAndDrop(source, target).build().perform();
		// Italy DragAndDrop
		WebElement source2 = driver.findElement(By.id("box6"));
		WebElement target2 = driver.findElement(By.id("box106"));
		action.dragAndDrop(source2, target2).build().perform();
		// Spain DragAndDrop
		WebElement source3 = driver.findElement(By.id("box7"));
		WebElement target3 = driver.findElement(By.id("box107"));
		action.dragAndDrop(source3, target3).build().perform();
		// Norway DragAndDrop
		WebElement source4 = driver.findElement(By.id("box1"));
		WebElement target4 = driver.findElement(By.id("box101"));
		action.dragAndDrop(source4, target4).build().perform();
		// Denmark DragAndDrop
		WebElement source5 = driver.findElement(By.id("box4"));
		WebElement target5 = driver.findElement(By.id("box104"));
		action.dragAndDrop(source5, target5).build().perform();
		// South Korea DragAndDrop
		WebElement source6 = driver.findElement(By.id("box5"));
		WebElement target6 = driver.findElement(By.id("box105"));
		action.dragAndDrop(source6, target6).build().perform();
		// South Korea DragAndDrop
		WebElement source7 = driver.findElement(By.id("box2"));
		WebElement target7 = driver.findElement(By.id("box102"));
		action.dragAndDrop(source7, target7).build().perform();

	}

}
