package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG8 {

	WebDriver driver;

	@BeforeClass
	public void setEnv() {

		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}

	@DataProvider
	public Object[][] dataSet() throws Exception {

		ObjectRepository or = new ObjectRepository();

		// Specify the location of property file
		File src = new File(
				"C:\\ProgramData\\SeleniumTraining\\Repository\\Object_Repo.properties");

		// Create FileInputStream class object to load the file
		FileInputStream fis = new FileInputStream(src);

		// Create Properties class object to read properties file
		Properties pro = new Properties();
		pro.load(fis);

		Object arr[][] = new Object[3][2];

		arr[0][0] = pro.getProperty("EmailTestData");
		arr[0][1] = pro.getProperty("PasswordTestData");

		arr[1][0] = "Email_2";
		arr[1][1] = "Password_2";

		arr[2][0] = "Email_3";
		arr[2][1] = "Password_3";

		return arr;
	}

	@Test(dataProvider = "dataSet")
	public void enterCred(String UserName, String Password) throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(UserName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
		driver.navigate().back();

	}

}

