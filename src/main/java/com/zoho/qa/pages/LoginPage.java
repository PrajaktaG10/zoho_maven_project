package com.zoho.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import com.zoho.qa.base.TestBase;

public class LoginPage extends TestBase {
	
     @FindBy(name="LOGIN_ID") 
     WebElement username;
     @FindBy(id="nextbtn")
     WebElement nextBtn;
     @FindBy(name="PASSWORD")
     WebElement password;
     @FindBy(xpath="//button[@id='nextbtn']//span[contains(text(),'Sign in')]")
     WebElement signinbtn;
     
     public LoginPage() {
    	 PageFactory.initElements(driver, this);
     }
     
     public String validateLoginPageTitle() {
    	return driver.getTitle();
     }
    
	public LoginPage enterUsername(String un){
		/*WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOf(username));*/
		username.sendKeys(un);
		nextBtn.click();
		return new LoginPage();
	}
		
	public HomePage enterPassword(String pwd) {
		/*WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOf(username));*/
		password.sendKeys(pwd);
		signinbtn.click();
		return new HomePage();
	}
	
}
