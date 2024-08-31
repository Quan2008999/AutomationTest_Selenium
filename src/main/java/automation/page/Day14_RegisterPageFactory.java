package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day14_RegisterPageFactory {

	private WebDriver driver;
	@FindBy(xpath = "//a[@class='btn-anis-effect' and text()='Đăng Ký']") WebElement btnDangKy;
	@FindBy(id="txtFirstname") WebElement textFirstname;
	@FindBy(id="txtEmail") WebElement textEmail;
	@FindBy(id="txtCEmail") WebElement textCEmail;
	@FindBy(id="txtPassword") WebElement textPassword;
	@FindBy(id="txtCPassword") WebElement textCPassword;
	@FindBy(id="txtPhone") WebElement textPhone;
	@FindBy(xpath = "//button[text()='ĐĂNG KÝ' and @type='submit']") WebElement buttonDangKy;
	
	public Day14_RegisterPageFactory(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	
	public void RegisterFunction(String firstname, String email, String cemail, String pass, String cpass, String phone) {
		btnDangKy.click();
		textFirstname.sendKeys(firstname);
		textEmail.sendKeys(email);
		textCEmail.sendKeys(cemail);
		textPassword.sendKeys(pass);
		textCPassword.sendKeys(cpass);
		textPhone.sendKeys(phone);
		buttonDangKy.click();
	}
}
