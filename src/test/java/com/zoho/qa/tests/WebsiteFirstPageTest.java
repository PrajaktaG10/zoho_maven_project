package com.zoho.qa.tests;

import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.zoho.qa.base.TestBase;
import com.zoho.qa.pages.LoginPage;
import com.zoho.qa.pages.WebsiteFirstPage;

public class WebsiteFirstPageTest extends TestBase{
	WebsiteFirstPage websiteFirstPage;
	LoginPage loginPage;
	public WebsiteFirstPageTest() {
		super();
	}

	@Test(priority=1)
	public void pageTitleTest() {
	String title= websiteFirstPage.validatepageTitle();
	Assert.assertEquals(title, "Zoho - Cloud Software Suite and SaaS Applications for Businesses");
	}
	@Test(priority=2)
	public void pageLogoTest() {
		boolean flag= websiteFirstPage.validateLogo();
		Assert.assertTrue(flag);
	}
	@Test(priority=3)
	public void Test() {
		loginPage= websiteFirstPage.clickLogin();
	}
	
   @BeforeTest
   public void setUp() {
	   initialization();
	   websiteFirstPage = new WebsiteFirstPage();
   }
   @AfterTest
   public void tearDown() {
	   driver.quit();
   }
}
