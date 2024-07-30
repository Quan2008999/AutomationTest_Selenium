package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Day8_BTVN2 extends CommonBase {

	@BeforeMethod
	public void openBrower() {
		driver = initChromeDriver("https://automationfc.github.io/basic-form/index.html");
	}
	
	@Test
	public void findElementBy() {
		WebElement idName = driver.findElement(By.id("name"));
		System.out.println(idName);
		
		WebElement txtName = driver.findElement(By.name("name"));
		System.out.println(txtName);
		
		WebElement idAddress = driver.findElement(By.id("address"));
		System.out.println(idAddress);
		
		WebElement txtAddress = driver.findElement(By.name("address"));
		System.out.println(txtAddress);
		
		WebElement idEmail = driver.findElement(By.id("email"));
		System.out.println(idEmail);
		
		WebElement txtEmail = driver.findElement(By.name("email"));
		System.out.println(txtEmail);
		
		WebElement idPassword = driver.findElement(By.id("password"));
		System.out.println(idPassword);
		
		WebElement txtPassword = driver.findElement(By.name("password"));
		System.out.println(txtPassword);
	}
}
