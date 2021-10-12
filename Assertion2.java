package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 {
	@Test
	public void testCase2() {
		
		//variable declaration of integer
		int a = 10;
		int b = 20;

		String actualMessage = "Google";
		String expectedMessage = "Google";

		Assert.assertEquals(actualMessage, expectedMessage, "Actual and Expected are not matching.");
		//here we use Assert.assertEquals(String actual, String expected, String message);
		System.out.println("Assertion Pass");

		Assert.assertFalse(a > b, "assertFalse condition get failed");
		//here we use Assert.assertFalse(boolean condition, string message);
		System.out.println("Balle Balle");

		Assert.assertTrue(a > b, "Test Case will fail as b is greater");
		// As assertion fails, execution will stop here
		// Further line of code will not execute for same method
		System.out.println("We are checking assertion");
	}

	@Test
	public void testCase3() {
		// Assertion are written in testCase2() method
		// Hence the scope of assertion will be limited to testCase2() method only.
		System.out.println("Hello Assertion");
	}

}
