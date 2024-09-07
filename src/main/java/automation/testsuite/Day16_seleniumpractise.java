package automation.testsuite;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day16_seleniumpractise extends CommonBase {

	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_PageURLs.URL_seleniumpractise);
	}
	
	@Test(priority = 1)
	public void verifyAlertMessage() {
		click(By.xpath("//button[text()='Try it']"));
		waitAlert();
		String actualMessage = driver.switchTo().alert().getText();
		assertEquals(actualMessage, "Welcome to Selenium WebDriver Tutorials");
	}
}
