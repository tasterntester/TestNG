package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakeScreenshot2 {
	//from program 1
	TakeScreenshot1 t1 = new TakeScreenshot1();

	@Test(priority = 1)
	public void doLogin() throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (2)\\chromedriver.exe");
		//here we are using t1 because we used webdriver in program 1
		t1.driver = new ChromeDriver();
		t1.driver.manage().window().maximize();
		t1.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		t1.driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		t1.driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abc@gmail.com");
		t1.driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("12345");

		// Passing wrong id so that our test case will fail
		t1.driver.findElement(By.xpath("//*[@id='login_button_test']")).click();
	}

	@Test(priority = 2)
	public void assertionCheck() {
		System.out.println("Assertion Check");
	}

	@AfterMethod
	public void takeScreenshotOnFailure(ITestResult result) throws Exception {
		t1.captureScreenshot(result);
	}
}
