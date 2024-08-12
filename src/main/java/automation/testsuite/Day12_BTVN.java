package automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day12_BTVN extends CommonBase {

	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_PageURLs.URL_SELENIUMEASY4);
	}
	
	@Test
	public void case1_DropdownlistState() {
		Select dropdownState = new Select(driver.findElement(By.name("state")));
		assertEquals(dropdownState.getOptions().size(), 52);
		
		dropdownState.selectByVisibleText("Alaska");
		assertEquals(dropdownState.getFirstSelectedOption().getText(), "Alaska");
		
		dropdownState.selectByIndex(1);
		assertEquals(dropdownState.getFirstSelectedOption().getText(), "Alabama");
	}
	
	@Test
	public void case2_CheckDefaultValueHosting() {
		WebElement rdoYes = driver.findElement(By.xpath("//input[@name='hosting' and @value='yes']"));
		assertFalse(rdoYes.isSelected());
		
		WebElement rdoNo = driver.findElement(By.xpath("//input[@name='hosting' and @value='no']"));
		assertFalse(rdoNo.isSelected());
	}
}
