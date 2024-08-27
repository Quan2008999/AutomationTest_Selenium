package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.Day13_LoginPage;
import automation.page.LoginPage;
import automation.page.LogoutPageFactory;

public class Day13_LoginTest extends CommonBase {

	Day13_LoginPage login;
	LogoutPageFactory logoutFactory;
	@BeforeMethod
	public void openChrome() {
		driver = initFirefoxDriver(CT_PageURLs.URL_crmstar);
	}
	
	@Test
	public void loginSuccessfully() throws InterruptedException {
		login = new Day13_LoginPage(driver);
		login.LoginFunctino("admin@gmail.com", "12345678");
		assertTrue(driver.findElement(By.xpath("//p[text()='Quản lý người dùng']")).isDisplayed());
		Thread.sleep(10000);
		logoutFactory = new LogoutPageFactory(driver);
		logoutFactory.LogoutFunction();
		assertTrue(driver.findElement(By.xpath("//h4[text()='Đăng nhập']")).isDisplayed());
	}
	
	@Test
	public void loginFail_UsernameNoExist() {
		login = new Day13_LoginPage(driver);
		login.LoginFunctino("randomemail@gmail.com", "12345678");
		assertTrue(driver.findElement(By.xpath("//h4[text()='Đăng nhập']")).isDisplayed());
	}
	
	@Test
	public void loginFail_PasswordInvalid() {
		login = new Day13_LoginPage(driver);
		login.LoginFunctino("admin@gmail.com", "123456789");
		assertTrue(driver.findElement(By.xpath("//h4[text()='Đăng nhập']")).isDisplayed());
	}
	
	@Test
	public void loginFail() {
		login = new Day13_LoginPage(driver);
		login.LoginFunctino("randomemail@gmail.com", "123456789");
		assertTrue(driver.findElement(By.xpath("//h4[text()='Đăng nhập']")).isDisplayed());
	}
}
