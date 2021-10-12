package selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {
	//public statement applicable for all
	WebDriver driver; 

	@Test
	public void testCase1() throws Exception {
		//expected output comment
		String expectedValidation = "Sorry, we don't recognize this email.";

		//common statement for all
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/");
		
		//javascript execute statement
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('login-signin').click()"); //login-signin is xpath from ispect
		
		//actual output comment
		Thread.sleep(3000);
		String actualValidation = driver.findElement(By.id("username-error")).getText(); //username-error is xpath from inspect
		//findElement method is used to access a single web element on a page.
		
		//assertion started
		Assert.assertEquals(actualValidation, expectedValidation);
		System.out.println("Equal Assertion Successfully Validated.");
		
		
		Thread.sleep(3000);
		Assert.assertFalse(driver.findElement(By.id("username-error")).isSelected());
		//The isSelected() method checks that if an element is selected on the web page or not.
		
		System.out.println("False Assertion Successfully Validated.");
		

		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(By.id("username-error")).isDisplayed());
		//The isDisplayed() method is used to check whether an element is displayed on a web page or not.
		
		System.out.println("True Assertion Successfully Validated.");
		
		
		
	}
}
