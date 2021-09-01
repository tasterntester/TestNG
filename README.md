# TestNG
TestNG Notes and Programming
**TestNG:- (It reduces the dependency of Java main method.)**

> NG means Next Generation.

#. TestNG is a testing framework, which is designed to cover all categories of test.

#. It overcomes the limitations of another popular testing framework called JUnit.

**Features of TestNG:**

1. It has ability to generate reports automatically.

2. It supports multiple annotations which makes tester life easy.

3. Test cases can be grouped & prioritized using TestNG.

4. It supports parallel execution of test cases.

5. We can parameterize our Selenium tests using TestNG.

6. We can run only failed test cases as well using TestNG.

**Execution Sequence of TestNG Annotations:**

> STCM

@BeforeSuite :- It will be run before all tests.

@BeforeTest:- It will be run before executing first test method in any of the class. @BeforeClass :- It will be run before the first test method in current class.

@BeforeMethod :- It will be run before each test method.

> @Test - It is marked as a test case.

@AfterMethod :- It will be run after each test method.

@AfterClass: It will be run after the last test method in current class.

@AfterTest - It will be run after executing last test method in any of the class.

@AfterSuite: It will be run after all tests.

#. @BeforeGroups & @AfterGroups will use for grouping concept. 

#. @DataProvider will use for data parameterization.

**Note:**

#. TestNG does not require java main() method for execution.

#. We used @Test to tell that the method under it is a test case.

#. Since we use annotations in TestNG, we needed to import the package org.testng.annotations.*; 
