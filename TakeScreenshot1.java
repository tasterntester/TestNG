package selenium;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeScreenshot1 {

	WebDriver driver;

	public void captureScreenshot(ITestResult result) throws Exception {

		if (ITestResult.FAILURE == result.getStatus()) {

			// Create Reference of TakeScreenshot Interface and Type Casting
			TakesScreenshot ts = (TakesScreenshot) driver; // Type Casting of the Interface

			// Call getScreenshotAs() method to capture the screenshot in terms of FILE
			// getScreenshotAs() method return type is FILE
			File source = ts.getScreenshotAs(OutputType.FILE);

			// Copy File to specific location  here /sceenshot/ is folder result is file name .png is extention
			FileUtils.copyFile(source, new File("./Screenshots/" + result.getName() + ".png"));
			System.out.println(result.getName() + " method() Screenshot Captured");

		}
	}

}
