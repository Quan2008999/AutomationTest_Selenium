package automation.testsuite;

import static org.testng.Assert.assertEquals;
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
import automation.page.Day16_ChinhSuaPageFactory;
import automation.page.Day16_LoginPageFactory;
import automation.page.LoginPageFactory;
import automation.page.LogoutPageFactory;

public class Day16_LoginTestFactory extends CommonBase {

	
	Day16_ChinhSuaPageFactory EditInformation;
	Day16_LoginPageFactory LoginFactory;
	
	@BeforeMethod
	public void openFirefox() {
		driver = initFirefoxDriver(CT_PageURLs.URL_ALADA);
	}
	
	@Test(priority = 1)
	public void RegisterSuccessfully() {
		LoginFactory = new Day16_LoginPageFactory(driver);
		LoginFactory.LoginFunction("quanca203@gmail.com", "12345678ab");
		assertTrue(driver.findElement(By.xpath("//img[@alt='alada.vn']")).isDisplayed());
	}
	
	@Test(priority = 2)
	public void EditInformationFunction() throws InterruptedException{
		EditInformation = new Day16_ChinhSuaPageFactory(driver);
		EditInformation.Edit_Function("12345678ab", "12345678ab1", "12345678ab1");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		String actualMessage = driver.switchTo().alert().getText();
		assertEquals(actualMessage, "Cập nhật mật khẩu mới thành công!");
		
	}
	
	
	
	//âbbababba
}
