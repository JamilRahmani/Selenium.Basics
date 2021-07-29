package basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityClass {

	// we will write static methods for our utilities.
	// these methods can be called by writting class.methodName
	// these methods can be used many times through out the execution.

	public static void screenShot(WebDriver driver, String fileName) {

		String location = ".\\output\\";

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File(location + fileName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
