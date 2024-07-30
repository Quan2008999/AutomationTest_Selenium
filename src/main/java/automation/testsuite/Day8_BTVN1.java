package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;

public class Day8_BTVN1 extends CommonBase {

	@BeforeMethod
	public void openBrower() {
		driver = initChromeDriver("https://selectorshub.com/xpath-practice-page/");
	}
	
	@Test
	public void findElementBy() {
		WebElement txtUserEmail = driver.findElement(By.name("email"));
		System.out.println(txtUserEmail);
		
//		WebElement classEmail = driver.findElement(By.className("selectors-input jsSelector"));
//		System.out.println(classEmail);
	
		WebElement idPassword = driver.findElement(By.id("pass"));
		System.out.println(idPassword);
	
		WebElement txtPassword = driver.findElement(By.name("Password"));
		System.out.println(txtPassword);
	
//		WebElement classPassword = driver.findElement(By.className("selectors-input jsSelector"));
//		System.out.println(classPassword);

		WebElement txtCompany = driver.findElement(By.name("company"));
		System.out.println(txtCompany);
		
		WebElement classCompany = driver.findElement(By.className("form-control"));
		System.out.println(classCompany);
		
		WebElement txtMobiphone = driver.findElement(By.name("mobile number"));
		System.out.println(txtMobiphone);
		
		WebElement classMobiphone = driver.findElement(By.className("form-control"));
		System.out.println(classMobiphone);
		
		WebElement linkdownload = driver.findElement(By.linkText("DownLoad Link"));
		System.out.println(linkdownload);
		
		WebElement buttonOpenWindow = driver.findElement(By.tagName("button"));
		System.out.println(buttonOpenWindow);
	}
		
//		WebElement linkYoutube = driver.findElement(By.partialLinkText(" SelectorsHub Youtube Channel  "));
//		System.out.println(linkYoutube);
	}

