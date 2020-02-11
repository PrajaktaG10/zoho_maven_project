package com.zoho.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoho.qa.base.TestBase;

public class InventoryPage extends TestBase{
      @FindBy(xpath="//a[@id='ember97']")
      WebElement items;
      @FindBy(xpath="//a[@id='ember100']")
	  WebElement itemgroups;
      @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]/button[2]") 
      WebElement New;
      
	  public InventoryPage() {
   	   PageFactory.initElements(driver, this);
      }
      public String validatePageTitle() {
   	   return driver.getTitle();
      }
      public void clickOnItems(){
    	items.click();
      }
      public void clickOnItemsGroup() throws InterruptedException {
    	  itemgroups.click();
    	  Thread.sleep(2000);
      }
      public NewItemGroupPage clickOnNew() {
    	  New.click();
    	  return new NewItemGroupPage();
      }
}
