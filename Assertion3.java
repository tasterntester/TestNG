package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion3 {

	@Test
	public void testCase4() {

		String actualMessage = "Google";
		String expectedMessage = "Goooogle";

		try {
			Assert.assertEquals(actualMessage, expectedMessage, "Actual and Expected are not matching.");
		} catch (AssertionError a) {
			a.printStackTrace();
			System.out.println(a);
		}
		System.out.println("We are checking assertion.");

	}

}
