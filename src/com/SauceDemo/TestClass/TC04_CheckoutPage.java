package com.SauceDemo.TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.SauceDemo.POMclass.POM01_LoginPage;
import com.SauceDemo.POMclass.POM02_HomePage;
import com.SauceDemo.POMclass.POM04_CheckoutPage;

public class TC04_CheckoutPage 
{
	public static void main(String[] args)
	{
	
	System.setProperty("webdriver.chrome.driver", "D:\\HOME\\SOFTWARE AS TESTER\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com");
	
	POM01_LoginPage lp = new POM01_LoginPage(driver);
	
	lp.sendUserName();
	
	lp.sendPassword();
	
	lp.clickloginbutton();
	
	POM02_HomePage hp=new POM02_HomePage(driver);
	hp.clickaddtocartbackpack();
	hp.cartbutton();
	
	
	POM04_CheckoutPage cp = new POM04_CheckoutPage(driver);
	
	cp.firstname1();
	cp.lastname1();
	cp.postalcode1();
	cp.continuebutton1();
//	
	}

}
