package automation.testsuite;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day17_BTVN extends CommonBase {

	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_PageURLs.URL_mediamart);
	}
	
	@Test
	public void handleIframeMessenger() {
		scrollToElement(By.xpath("//div[@class='widget-preview--body']"));
		WebElement btnGuiTinNhan = getElementPresentDOM(By.xpath("//div[@class='widget-preview--body']"));
		driver.switchTo().frame(btnGuiTinNhan);
		click(By.xpath("//div[text()='Gửi tin nhắn']"));
	}
	
	@Test
	public void handleIframeZalo() {
		waitAlert();
		scrollToElement(By.xpath("//div[@class='logo']"));
		WebElement btnZalo = getElementPresentDOM(By.xpath("//div[@class='logo']"));
		driver.switchTo().frame(btnZalo);
		click(By.xpath("//div[@class='logo']"));
		
	}
}
