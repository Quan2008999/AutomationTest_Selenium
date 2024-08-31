package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day14_LoginPageFactory {

	private WebDriver driver;
	@FindBy(id="txtLoginUsername") WebElement textLoginUsername;
	@FindBy(id="txtLoginPassword") WebElement textLoginPassword;
	@FindBy(xpath = "//button[text()='ĐĂNG NHẬP' and @type='submit']") WebElement buttonDangNhap;
	
	public Day14_LoginPageFactory(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	
	public void LoginFunction(String username, String pass) {
		textLoginUsername.sendKeys(username);
		textLoginPassword.sendKeys(pass);
		buttonDangNhap.click();
	}
}
