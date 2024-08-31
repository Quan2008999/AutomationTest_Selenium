package automation.testsuite;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.Day14_ChinhSuaPageFactory;
import automation.page.Day14_LoginPageFactory;
import automation.page.Day14_RegisterPageFactory;
import automation.page.LoginPageFactory;
import automation.page.LogoutPageFactory;

public class Day14_LoginTestFactory extends CommonBase {

	Day14_RegisterPageFactory registerFactory;
	Day14_ChinhSuaPageFactory EditInformation;
	Day14_LoginPageFactory LoginFactory;
	
	@BeforeMethod
	public void openFirefox() {
		driver = initFirefoxDriver(CT_PageURLs.URL_ALADA);
	}
	
	@Test(priority = 1)
	public void RegisterSuccessfully() {
		registerFactory = new Day14_RegisterPageFactory(driver);
		registerFactory.RegisterFunction("Cao Anh Quan", "quanca203@gmail.com", "quanca203@gmail.com", "12345678", "12345678", "0392087387");
		assertTrue(driver.findElement(By.xpath("//img[@alt='alada.vn']")).isDisplayed());
	}
	
	@Test(priority = 2)
	public void EditInformationFunction() throws InterruptedException{
		LoginFactory = new Day14_LoginPageFactory(driver);
		LoginFactory.LoginFunction("quanca203@gmail.com", "12345678");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		assertTrue(driver.findElement(By.xpath("(//a[text()='Khoá học của tôi'])[1]")).isDisplayed());
		EditInformation = new Day14_ChinhSuaPageFactory(driver);
		EditInformation.Edit_Function("quanca203@gmail.com", "12345678ab", "12345678ab");
	}
	
	@Test(priority = 3)
	public void loginSuccessfully() {
		LoginFactory = new Day14_LoginPageFactory(driver);
		LoginFactory.LoginFunction("quanca203@gmail.com", "12345678ab");
		assertTrue(driver.findElement(By.xpath("//img[@alt='alada.vn']")).isDisplayed());
	}
}
