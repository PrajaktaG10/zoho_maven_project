package com.zoho.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoho.qa.base.TestBase;

public class NewItemGroupPage extends TestBase {
	 @FindBy(xpath="//label[contains(text(),'Goods')]")
	  List<WebElement> goods;
	 @FindBy(xpath="//fieldset[contains(@class,'form-group')]//div[2]")
	 List<WebElement> service;
	 String type;
     @FindBy(xpath="//input[@id='ember283']")
	 WebElement item_group_name;
     @FindBy(xpath="//textarea[@id='ember284']")
	 WebElement description;
     @FindBy(xpath="//input[@id='ZMHWm']")
     WebElement returnable_item_checkbox;
     @FindBy(xpath="//input[@id='ember292']")
     WebElement unit;
     @FindBy(xpath="//span[text()='Select or Add Manufacturer']")
     WebElement manufacturer;
     @FindBy(xpath="//span[text()='Select or Add Brand']")
     WebElement brand;
     @FindBy(xpath="//input[@id='HVIVU']")
     WebElement multiple_items_checkbox;
     @FindBy(xpath="//input[@id='ember350']")
     WebElement attribute;
     @FindBy(xpath="//input[@id='ember352']")
     WebElement options;
     @FindBy(xpath="//a[contains(@class,'add-attribute')]")
     WebElement add_more_attribute;
     @FindBy(xpath="//input[@id='ember363']")
     WebElement attribute1;
     @FindBy(xpath="//input[@id='ember365']")
     WebElement options1;
     @FindBy(xpath="//div[contains(@class,'col-lg-auto')]//div[1]//label[1]")
     WebElement select_itemType1;
     @FindBy(xpath="//label[contains(text(),'Non-Inventory')]")
     WebElement select_itemType2;
     @FindBy(xpath="//span[contains(@class,'font-small text-blue cursor-pointer')]")
     WebElement sku;
     @FindBy(xpath="//button[@id='ember659']")
     WebElement generate_sku;
   @FindBy(xpath="//input[@id='ember522']")
     WebElement price1;
   @FindBy(xpath="//input[@id='ember533']")
   WebElement price2;
   @FindBy(xpath="//input[@id='ember544']")
   WebElement price3;
   @FindBy(xpath="//input[@id='ember523']")
   WebElement sellingprice1;
   @FindBy(xpath="//input[@id='ember534']")
   WebElement sellingprice2;
   @FindBy(xpath="//input[@id='ember545']")
   WebElement sellingprice3;
   @FindBy(xpath="//input[@id='ember527']")
   WebElement reorder_point;
   @FindBy(xpath="//th[8]//a[1]")
   WebElement reorder_point_copytoall;  
   @FindBy(xpath="//button[@id='ember316']")
   WebElement save;  
   
   public NewItemGroupPage() {
	   PageFactory.initElements(driver, this);
   }
   public void selectType() {
	if(type=="Goods") {
	   for(WebElement w:goods) {
		   if(w.isDisplayed()) {
			   if(w.isEnabled()) {
				   w.click();
			   }
		   }
	   }
	 }
	   else {
		   for(WebElement w:service) {
			   if(w.isDisplayed()) {
				   if(w.isEnabled()) {
					   w.click();
				   }
			   }
		   }
	   }
   }
   
   
   
   
   
   
   
   
}

