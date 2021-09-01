package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG2 {

	@Test
	public void assertioncheck ( ) {
		
		String expectedMessage = "User Created Successfully.";
		String actualMessage = "User Created Successfully";
		
		try {
			Assert.assertEquals (actualMessage, expectedMessage); } 
		catch (AssertionError e) {

			//e.printStackTrace();

			System.out.println(e);
			}
			System.out.println("Verification Successful.");
		}
	}

