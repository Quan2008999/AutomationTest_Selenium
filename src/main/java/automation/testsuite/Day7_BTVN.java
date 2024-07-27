package automation.testsuite;

import java.util.Scanner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day7_BTVN {

	
	public String name;
	Scanner scanner = new Scanner(System.in);
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@BeforeMethod
	public void openBrower() {
		System.out.println("This method to open chrome brower");
	}

	@Test
	public void testcase1() {
		name = scanner.nextLine();
		System.out.println("Họ tên nhân viên là : "+name);
	}

	@AfterMethod
	public void closebrower() {
		System.out.println("This method to close chrome brower");
	}
}
