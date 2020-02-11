package com.zoho.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import com.zoho.qa.base.TestBase;


public class WebsiteFirstPage extends TestBase {
    //Page factory
	@FindBy(xpath="//a[@class='zh-login']")
	WebElement loginBtn;
	@FindBy(xpath="//a[@class='zh-signup']")
	WebElement signUpBtn;
	@FindBy(xpath="//span[@class='zoho-logo']")
	WebElement zohoLogo;
	//Initializing page objects
	public WebsiteFirstPage() {
		PageFactory.initElements(driver, this);
	}
	//Actions
	public String validatepageTitle() {
		return driver.getTitle();
	}
	public boolean validateLogo() {
		return zohoLogo.isDisplayed();
	}
	public LoginPage clickLogin() {
		/*WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.visibilityOf(loginBtn));*/
		loginBtn.click();
		return new LoginPage();
	}
}
