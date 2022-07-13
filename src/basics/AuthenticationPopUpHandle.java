package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUpHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/basic_auth");

		// Now we can handle Authentication Popup with using below sytanx:
		// http://{userName}:{password}@url

		String userName = "admin";
		String password = "admin";
		// String url = "http://the-internet.herokuapp.com/basic_auth";
		String authenticatedURL = "http://" + userName + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";
		
		driver.navigate().to(authenticatedURL);
		// driver.get(authenticatedURL);
	}

}
