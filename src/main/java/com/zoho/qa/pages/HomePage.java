package com.zoho.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoho.qa.base.TestBase;


public class HomePage extends TestBase {
       @FindBy(xpath="//span[@class='_logo-books _logo-x96 zod-app-logo']")
       WebElement books;
       @FindBy(xpath="//div[contains(text(),'Calendar')]")
       WebElement calender;
       @FindBy(xpath="//div[contains(text(),'Campaigns')]")
       WebElement campaigns;
       @FindBy(xpath="//span[@class='_logo-chat _logo-x96 zod-app-logo']")
       WebElement cliq;
       @FindBy(xpath="//span[@class='_logo-connect _logo-x96 zod-app-logo']")
       WebElement connect;
       @FindBy(xpath="//span[@class='_logo-creator _logo-x96 zod-app-logo']")
       WebElement creator;
       @FindBy(xpath="//span[@class='_logo-crm _logo-x96 zod-app-logo']")
       WebElement crm;
       @FindBy(xpath="//span[@class='_logo-crm _logo-x96 zod-app-logo']")
       WebElement desk;
       @FindBy(xpath="//span[@class='_logo-inventory _logo-x96 zod-app-logo']")
       WebElement inventory;
       @FindBy(xpath="//span[@class='_logo-invoice _logo-x96 zod-app-logo']")
       WebElement invoice;
       @FindBy(xpath="//span[@class='_logo-mail _logo-x96 zod-app-logo']")
       WebElement mail;
       @FindBy(xpath="//span[@class='_logo-sheet _logo-x96 zod-app-logo']")
       WebElement sheet;
       @FindBy(xpath="//span[@class='_logo-show _logo-x96 zod-app-logo']")
       WebElement show;
       @FindBy(xpath="//span[@class='_logo-workdrive _logo-x96 zod-app-logo']")
       WebElement workdrive;
       @FindBy(xpath="//span[@class='_logo-writer _logo-x96 zod-app-logo']")
       WebElement writer;
	
       public HomePage() {
    	   PageFactory.initElements(driver, this);
       }
       public String validateHomePageTitle() {
    	   return driver.getTitle();
       }
       
       public InventoryPage clickOnInventoryPage() {
   		inventory.click();
   		return new InventoryPage();
   	    }
       public InvoicePage clickOnInvoicePage() {
      		invoice.click();
      		return new InvoicePage();
        }
       public MailPage clickOnMailPage() {
      		mail.click();
      		return new MailPage();
       }
       public WriterPage clickOnWriterPage() {
      		writer.click();
      		return new WriterPage();
        }
       public ShowPage clickOnShowPage() {
      		show.click();
      		return new ShowPage();
        }
       public SheetPage clickOnSheetPage() {
      		sheet.click();
      		return new SheetPage();
      	}
       public CrmPage clickOnCrmPage() {
      		crm.click();
      		return new CrmPage();
        }
       public CliqPage clickOnCliqPage() {
      		cliq.click();
      		return new CliqPage();
      	 }
       public DeskPage clickOnDeskPage() {
      		desk.click();
      		return new DeskPage();
      	 }
       public ConnectPage clickOnConnectPage() {
      		connect.click();
      		return new ConnectPage();
      	 }
       public BooksPage clickOnBooksPage() {
      		books.click();
      		return new BooksPage();
      	}
       public WorkDrivePage clickOnWorkDrivePage() {
      		workdrive.click();
      		return new WorkDrivePage();
      	}
       public CreatorPage clickOnCreatorPage() {
      		creator.click();
      		return new CreatorPage();
        }
       public CampaignsPage clickOnCampaignsPage() {
    	   campaigns.click();
      		return new CampaignsPage();
        }
       public CalenderPage clickOnCalenderPage() {
    	   calender.click();
      		return new CalenderPage();
        }
       
}
