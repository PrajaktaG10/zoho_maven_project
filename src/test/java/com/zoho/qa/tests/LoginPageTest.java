package com.zoho.qa.tests;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zoho.qa.base.TestBase;
import com.zoho.qa.pages.HomePage;
import com.zoho.qa.pages.LoginPage;
import com.zoho.qa.pages.WebsiteFirstPage;
import com.zoho.qa.util.TestUtil;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	WebsiteFirstPage websiteFirstPage;
	TestUtil testUtil;
	
	public LoginPageTest() {
		super();
	}
	
	@Test(priority=3)
	public void loginPageTitleTest() {
		String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Zoho Home");
	}
	
	@Test(priority=1)
	public void enterUnTest() {
		loginPage=loginPage.enterUsername(prop.getProperty("username"));
	}
	@Test(priority=2)
	public void enterPwdTest() throws InterruptedException {
		homePage=loginPage.enterPassword(prop.getProperty("password"));
		Thread.sleep(4000);
	}
	@BeforeTest
	public void setUp() {
		initialization();
		 testUtil=new TestUtil();
		 websiteFirstPage= new WebsiteFirstPage();
		 homePage=new HomePage();
		 loginPage = new LoginPage();
		 loginPage= websiteFirstPage.clickLogin();
		 
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
   
}
