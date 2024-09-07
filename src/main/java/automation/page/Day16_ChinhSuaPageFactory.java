package automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Day16_ChinhSuaPageFactory {

	private WebDriver driver;
	@FindBy(xpath="//div[@class='avatar2']/descendant::img")
	WebElement btnInfo;
	@FindBy(xpath="//a[text()='Chỉnh sửa thông tin']")
	WebElement btnEditInfo;
	@FindBy(id = "txtpassword") WebElement textPassword;
	@FindBy(id = "txtnewpass") WebElement textNewPass;
	@FindBy(id = "txtrenewpass") WebElement textRenewpass;
	@FindBy(xpath="//button[text()='Lưu mật khẩu mới']")
	WebElement btnLuu;
	
	public Day16_ChinhSuaPageFactory(WebDriver _driver) {
		this.driver = _driver;
		PageFactory.initElements(_driver, this);
	}
	
	public void Edit_Function(String pass, String newpass, String renewpass) {
		try {
			btnInfo.click();
			Thread.sleep(2000);
			btnEditInfo.click();
			Thread.sleep(2000);
			textPassword.sendKeys(pass);
			textNewPass.sendKeys(newpass);
			textRenewpass.sendKeys(renewpass);
			Thread.sleep(2000);
			btnLuu.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
