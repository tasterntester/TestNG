package selenium;

import org.testng.annotations.*; //FOR MULTIPLE ANNATATIONS USE STAR "*"

public class TestNG1 {

	
	@Test
	public void a2() { 
		System.out.println("a2 test method");

	 } 

	 @BeforeTest 
	 public void b() {
	    System.out.println("Before Test Method");

	 }

	 @BeforeSuite
	 public void c() { 
		 System.out.println("BeforeSuite Method"); 
	}

	 @AfterMethod
	 public void d() { 
		 System.out.println("AfterMethod method");

	}

     @BeforeClass
	public void e() { 
    	 System.out.println("BeforeClass Method");

	 }

	 @AfterTest
	public void f() { 
		 System.out.println("After Test Method");
		 
	 }
	 
	 @AfterClass
	 public void g() {

	 System.out.println("AfterClass Method");
	 
	 }

	 @BeforeMethod

	 public void h() {

	 System.out.println("BeforeMethod Method");

	 }

	 @AfterSuite

	 public void i() {

	 System.out.println("AfterSuite Method");

	 }

	 @Test

	 public void al() {

	 System.out.println("al test method");
	 
	 }
}
