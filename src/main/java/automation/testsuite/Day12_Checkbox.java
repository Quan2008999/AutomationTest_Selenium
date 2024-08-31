package automation.testsuite;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_PageURLs;

public class Day12_Checkbox extends CommonBase {

	@BeforeMethod
	public void openChrome() {
		driver = initChromeDriver(CT_PageURLs.URL_SELENIUMEASY);
	}

	@Test
	public void case1_CheckDefaultValue() {
		WebElement defaultCheck = driver.findElement(By.xpath("//label[normalize-space()='Default Checked']/descendant::input"));

		assertTrue(defaultCheck.isSelected());
	}

	@Test
	public void case2_CheckThisCheckboxSuccessfully() {
		WebElement thisCheckbox = driver
				.findElement(By.xpath("//label[@class='checkbox-inline']/descendant::input"));
		if (thisCheckbox.isSelected() == false) {
			thisCheckbox.click();
			// Expect that text "Success = Check box is checked" display
			WebElement textSuccess = driver.findElement(By.id("txtAge"));
			assertTrue(textSuccess.isDisplayed());
		}
	}
	
	@Test
	public void case1_CheckMultipleCheckboxSuccessfully() {
		List<WebElement> listCheckbox = driver.findElements(By.xpath("(//div[@class='panel-body'])[3]/descendant::input[@type='checkbox']"));
		for(int i=0; i<listCheckbox.size(); i++) {
			WebElement checkbox = listCheckbox.get(i);
			if(checkbox.isSelected() == false) {
				checkbox.click();
				assertTrue(checkbox.isSelected());
				System.out.println("Checkbox thứ "+(i+1)+ "đã được checked");
			}
		}
	}
	
	@Test
	public void case2_CheckMultipleCheckboxSuccessfully() {
		List<WebElement> listCheckbox = driver.findElements(By.xpath("(//div[@class='panel-body'])[3]/descendant::input[@type='checkbox']"));
		for(int i=0; i<listCheckbox.size(); i++) {
			WebElement checkbox = driver.findElement(By.xpath("(//div[@class='panel-body'])[3]/descendant::input[@type='checkbox']["+(i+1)+"]"));
			if(checkbox.isSelected() == false) {
				checkbox.click();
				assertTrue(checkbox.isSelected());
			}
		}
	}
	@AfterTest
	public void closeBrower() {
		driver.close();
	}
}
