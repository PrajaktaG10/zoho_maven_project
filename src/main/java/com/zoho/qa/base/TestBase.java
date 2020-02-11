package com.zoho.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.zoho.qa.util.TestUtil;

public class TestBase {
	public static Properties prop;
	public static WebDriver driver;
//Creating TestBase constructor
	public TestBase(){
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("F:\\JAVA P\\zoho_maven_project"
					+ "\\src\\main\\java\\com\\zoho\\qa\\config\\config.properties");
			prop.load(ip);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	//Method for initialization
	public static void initialization() {
		String browserName=prop.getProperty("browser");//To get the browser name from properties file
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
			driver=new ChromeDriver();//To create object of ChromeDriver
		}else if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "F:\\geckodriver.exe");
			driver=new FirefoxDriver();//To create object of FirefoxDriver
		}
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);//Implicit wait
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS );//To manage pageload time
		driver.manage().window().maximize();//To maximize browser window
		
		driver.manage().deleteAllCookies();//To delete all cookies
		driver.get(prop.getProperty("url"));//To open url
	}
	}

