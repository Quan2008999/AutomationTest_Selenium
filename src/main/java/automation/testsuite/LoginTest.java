package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.LoginPage;

public class LoginTest extends CommonBase {

	LoginPage login;
	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_PageURLs.URL_ALADA);
	}
	
	@Test
	public void loginSuccessfully() {
		login = new LoginPage(driver);
		login.LoginFunctino("demoemail@gmail.com", "123456");
		assertTrue(driver.findElement(By.xpath("(//a[text()='Khóa học của tôi'])[1]")).isDisplayed());
	}
	
	@Test
	public void loginFail_UsernameNoExist() {
		login = new LoginPage(driver);
		login.LoginFunctino("randomemail@gmail.com", "123456");
		assertTrue(driver.findElement(By.xpath("//p[text()='Email này chưa được đăng ký.']")).isDisplayed());
	}
	
//	@Test
//	public void loginFail_PasswordInvalid() {
//		
//	}
//	
//	@Test
//	public void loginFail_LeaveBlank() {
//		
//	}
}
