package selenium;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG5 {

	//@Test 
	public void a() {
		System.out.println("a test method");
	}
	
	//As Experience Professional, will use this
	@Test(enabled = false) //always industry recommended 
	public void b() {
		System.out.println("b test method");
	}
	
	//Test Case will Execute 2 times
	@Test(invocationCount = 2)
	public void c() {
		System.out.println("c test method");
	}
	
	//Test Case will Execute 0 time, means wil skip
	@Test(invocationCount = 0)
	public void d() {
		System.out.println("d test method");
	}
	
	//Correct way but not recommended
	@Test
	public void e() {
		System.out.println("e test method");
		throw new SkipException("skip e test method");
		//System.out.println("Method Skipping");   // unreachable code
	}
}
