package com.zoho.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.zoho.qa.base.TestBase;
import com.zoho.qa.pages.HomePage;
import com.zoho.qa.pages.InventoryPage;
import com.zoho.qa.pages.LoginPage;
import com.zoho.qa.pages.WebsiteFirstPage;
import com.zoho.qa.util.TestUtil;

public class HomePageTest extends TestBase{
	WebsiteFirstPage websiteFirstPage;
     LoginPage loginPage;
     HomePage homePage;
     InventoryPage inventoryPage;
     TestUtil testUtil;
     
     public HomePageTest() {
    	 super();
     }
	@Test(priority=1)
	public void validateHomePageTitleTest(){
		String title=homePage.validateHomePageTitle();
		Assert.assertEquals(title, "Zoho Accounts");
	 }
	@Test(priority=2)
	public void clickOnInventoryPageTest() {
		homePage.clickOnInventoryPage();
	}
	@BeforeTest
	public void setUp() {
		initialization();
		testUtil=new TestUtil();
		websiteFirstPage=new WebsiteFirstPage();
		loginPage=new LoginPage();
		homePage=new HomePage();
		inventoryPage=new InventoryPage();
		loginPage= websiteFirstPage.clickLogin();	
		loginPage=loginPage.enterUsername(prop.getProperty("username"));
		homePage=loginPage.enterPassword(prop.getProperty("password"));
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
