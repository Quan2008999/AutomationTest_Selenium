package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.Day14_LoginPageFactory;
import automation.page.LoginPageFactory;
import automation.page.LogoutPageFactory;

public class Day14_LoginTestFactory extends CommonBase {

	Day14_LoginPageFactory loginFactory;
	
	@BeforeMethod
	public void openFirefox() {
		driver = initFirefoxDriver(CT_PageURLs.URL_ALADA);
	}
	
	@Test
	public void loginSuccessfully() {
		loginFactory = new Day14_LoginPageFactory(driver);
		loginFactory.LoginFunction("Cao Anh Quan", "quanca201@gmail.com", "quanca201@gmail.com", "12345678", "12345678", "0392087387");
		assertTrue(driver.findElement(By.xpath("(//a[text()='Khóa học của tôi'])[1]")).isDisplayed());
	}
}
