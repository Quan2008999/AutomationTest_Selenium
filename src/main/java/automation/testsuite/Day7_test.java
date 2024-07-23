package automation.testsuite;

import org.testng.annotations.*;

import automation.common.CommonBase;

public class Day7_test extends CommonBase {
	@BeforeMethod
	public void openBrower() {
		System.out.println("This method to open chrome brower");
	}

	@Test
	public void testcase1() {
		System.out.println("This method to implement for testcase1");
	}

	@AfterMethod
	public void closebrower() {
		System.out.println("This method to close chrome brower");
	}
}
