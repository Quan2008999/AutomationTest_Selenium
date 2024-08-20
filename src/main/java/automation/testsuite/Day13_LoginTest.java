package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.Day13_LoginPage;
import automation.page.LoginPage;

public class Day13_LoginTest extends CommonBase {

	Day13_LoginPage login;
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_PageURLs.URL_crmstar);
	}
	
	@Test
	public void loginSuccessfully() {
		login = new Day13_LoginPage(driver);
		login.LoginFunctino("admin@gmail.com", "12345678");
		assertTrue(driver.findElement(By.xpath("//a[normalize-space()='Nhập hàng']")).isDisplayed());
	}
	
	@Test
	public void loginFail_UsernameNoExist() {
		login = new Day13_LoginPage(driver);
		login.LoginFunctino("randomemail@gmail.com", "12345678");
		assertTrue(driver.findElement(By.xpath("//span[text()='Email hoặc mật khẩu không đúng']")).isDisplayed());
	}
	
	@Test
	public void loginFail_PasswordInvalid() {
		login = new Day13_LoginPage(driver);
		login.LoginFunctino("admin@gmail.com", "123456789");
		assertTrue(driver.findElement(By.xpath("//span[text()='Email hoặc mật khẩu không đúng']")).isDisplayed());
	}
	
	@Test
	public void loginFail() {
		login = new Day13_LoginPage(driver);
		login.LoginFunctino("randomemail@gmail.com", "123456789");
		assertTrue(driver.findElement(By.xpath("//span[text()='Email hoặc mật khẩu không đúng']")).isDisplayed());
	}
}
