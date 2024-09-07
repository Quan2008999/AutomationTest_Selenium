package automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day16_GURU99 extends CommonBase {

	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_PageURLs.URL_CUSTOMER);
	}
	
	@Test(priority = 1)
	public void pressOkOnAlert() {
		driver.switchTo().alert().sendKeys("Quan123456");
		driver.switchTo().alert().accept();
		String actualMessage = driver.switchTo().alert().getText();
		assertEquals(actualMessage, "Do you really want to delete this Customer?");
	}
	
	@Test(priority = 2)
	public void pressOkOnAlert2() {
		driver.switchTo().alert().sendKeys("Quan123456");
		driver.switchTo().alert().accept();
		String actualMessage = driver.switchTo().alert().getText();
		assertEquals(actualMessage, "Customer Successfully Delete!");
	}
	
	@Test(priority = 3)
	public void pressOkOnAlert3() {
		driver.switchTo().alert().sendKeys("Quan123456");
		driver.switchTo().alert().accept();
		assertTrue(isElementVisibility(By.xpath("//td[text()='Delete Customer Form']")));
	}
}
