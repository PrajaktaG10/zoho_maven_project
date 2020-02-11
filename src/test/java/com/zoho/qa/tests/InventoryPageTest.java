package com.zoho.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.zoho.qa.base.TestBase;
import com.zoho.qa.pages.HomePage;
import com.zoho.qa.pages.InventoryPage;
import com.zoho.qa.pages.LoginPage;
import com.zoho.qa.pages.NewItemGroupPage;
import com.zoho.qa.pages.WebsiteFirstPage;
import com.zoho.qa.util.TestUtil;

public class InventoryPageTest extends TestBase{
	WebsiteFirstPage websiteFirstPage;
	  LoginPage loginPage;
	     HomePage homePage;
	     InventoryPage inventoryPage;
	     TestUtil testUtil;
	     NewItemGroupPage newItemGroupPage;
       public InventoryPageTest() {
    	   super();
       }
       
     @Test(priority=1)
       public void validatePageTitleTest() {
    	  String title= inventoryPage.validatePageTitle();
    	  Assert.assertEquals(title, "Dashboard | Zoho Inventory");
       }
	@Test(priority=2)
	 public void clickOnItemsTest() {
		 inventoryPage.clickOnItems();
	 }
    @Test(priority=3)
    public void clickOnItemsGroupTest() throws InterruptedException {
    	inventoryPage.clickOnItemsGroup();
    }
    @Test(priority=4)
    public void clickOnNewTest() {
    	inventoryPage.clickOnNew();    	
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
		inventoryPage=homePage.clickOnInventoryPage();
    }
    @AfterTest
    public void tearDown() {
    	driver.quit();
    }
    
}
