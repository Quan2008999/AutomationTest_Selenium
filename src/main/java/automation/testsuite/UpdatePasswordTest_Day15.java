package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.UpdatePassword_PageFactory;

public class UpdatePasswordTest_Day15 extends CommonBase {

	@BeforeMethod
	public void OpenChrome() {
		driver = initChromeDriver(CT_PageURLs.URL_TEDU);
	}
	
	@Test
	public void updatePasswordSuccessfully() {
		UpdatePassword_PageFactory updatePass = new UpdatePassword_PageFactory(driver);
		updatePass.LoginFunction("quancaoanh789@gmail.com", "12345678");
		updatePass.UpdatePassword("12345678", "12345678_new");
		assertTrue(driver.findElement(By.xpath("//div[text()='Đổi mật khẩu thành công. Mời bạn đăng nhập lại.']")).isDisplayed());
	}
}
