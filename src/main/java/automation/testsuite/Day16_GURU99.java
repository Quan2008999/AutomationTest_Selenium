package automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	public void acceptAlert() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("cusid")));
		WebElement cusTextBox =  driver.findElement(By.name("cusid"));
		cusTextBox.sendKeys("Quan123456");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("submit")));
		WebElement btnSubmit =  driver.findElement(By.name("submit"));
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
		btnSubmit.click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()='Delete Customer Form']")));
		assertTrue(driver.findElement(By.xpath("//td[text()='Delete Customer Form']")).isDisplayed());
	}
	
	@Test(priority = 2)
	public void dismissAlert() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("cusid")));
		WebElement cusTextBox =  driver.findElement(By.name("cusid"));
		cusTextBox.sendKeys("Quan123456");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("submit")));
		WebElement btnSubmit =  driver.findElement(By.name("submit"));
		wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
		btnSubmit.click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().dismiss();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[text()='Delete Customer Form']")));
		assertTrue(driver.findElement(By.xpath("//td[text()='Delete Customer Form']")).isDisplayed());
	}
	
	
}
