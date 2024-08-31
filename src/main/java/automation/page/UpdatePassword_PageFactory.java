package automation.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdatePassword_PageFactory {

	private WebDriver driver;
	@FindBy(id = "UserName")
	WebElement textUsername;
	@FindBy(id = "Password")
	WebElement textPassword;
	@FindBy(xpath = "//button[text()='Đăng nhập']")
	WebElement btnDangNhap;
	@FindBy(id = "my_account")
	WebElement btnAvatar;
	@FindBy(xpath = "//a[@title='Đổi mật khẩu']")
	WebElement btnUpdatePass;
	// OldPass
	@FindBy(id = "OldPassword")
	WebElement textOldPassword;
	@FindBy(id = "NewPassword")
	WebElement textNewPassword;
	@FindBy(id = "ConfirmNewPassword")
	WebElement textConfirmNewPassword;
	@FindBy(id = "onesignal-slidedown-cancel-button")
	WebElement cancelButton;
	@FindBy(xpath = "//input[@value='Cập nhật']")
	WebElement updatePassBtn;

	public UpdatePassword_PageFactory(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}

	public void LoginFunction(String email, String pass) {
		textUsername.sendKeys(email);
		textPassword.sendKeys(pass);
		btnDangNhap.click();
	}

	public void UpdatePassword(String oldPass, String newPass) {
		try {
			while (cancelButton.isDisplayed()) {
				cancelButton.click();
			}
		} catch (Exception ex) {
			btnAvatar.click();
			btnUpdatePass.click();
			textOldPassword.sendKeys(oldPass);
			textNewPassword.sendKeys(newPass);
			textConfirmNewPassword.sendKeys(newPass);
			updatePassBtn.click();
		}

	}
}
