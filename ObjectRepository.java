package selenium;


import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ObjectRepository {

	@Test
	public void readProperty() throws Exception {

		ObjectRepository or = new ObjectRepository();

		// Specify the location of property file
		File src = new File(
				"C:\\ProgramData\\SeleniumTraining\\Repository\\Object_Repo.properties");

		// Create FileInputStream class object to load the file
		FileInputStream fis = new FileInputStream(src);

		// Create Properties class object to read properties file
		Properties pro = new Properties();
		pro.load(fis);

		// Setting the chrome browser and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		or.hitURL(driver, pro.getProperty("URL1"));
		or.hitURL(driver, pro.getProperty("URL"));
		driver.get(pro.getProperty("URL1"));
		driver.get(pro.getProperty("URL"));
		Thread.sleep(3000);
		
		//getProperty() method accept key and it return value for the same key
		driver.findElement(By.xpath(pro.getProperty("Email"))).sendKeys(pro.getProperty("EmailTestData"));
		driver.findElement(By.xpath(pro.getProperty("Password"))).sendKeys(pro.getProperty("PasswordTestData"));
		Thread.sleep(3000);
		driver.quit();
	}

	// Hit URL
	public void hitURL(WebDriver driver, String urlAdd) {
		driver.get(urlAdd);	

	}	

}
