package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;
import automation.page.UpdatePassword_PageFactory_BTVN;

public class UpdatePasswordTest_Day15_BTVN extends CommonBase {

	@BeforeMethod
	public void OpenChrome() {
		driver = initChromeDriver(CT_PageURLs.URL_TEDU);
	}
	
	@Test(priority = 1)
	public void updatePasswordSuccessfully() {
		UpdatePassword_PageFactory_BTVN updatePass = new UpdatePassword_PageFactory_BTVN(driver);
		updatePass.LoginFunction("quancaoanh789@gmail.com", "12345678");
		updatePass.UpdatePassword("12345678", "12345678_new");
		assertTrue(driver.findElement(By.xpath("//div[text()='Đổi mật khẩu thành công. Mời bạn đăng nhập lại.']")).isDisplayed());
	}
	
	@Test(priority = 2)
	public void timKiemSuccessfully() {
		UpdatePassword_PageFactory_BTVN updatePass1 = new UpdatePassword_PageFactory_BTVN(driver);
		updatePass1.LoginFunction("quancaoanh789@gmail.com", "12345678_new");
		updatePass1.TimKiemFunction("ASP Net");
		assertTrue(driver.findElement(By.xpath("//a[text()='Bài 52: Gửi phản hồi và gửi mail trong ASP NET sử dụng SMTP']")).isDisplayed());
	}
}
