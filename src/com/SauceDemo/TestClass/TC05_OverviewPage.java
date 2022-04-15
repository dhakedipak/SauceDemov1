package com.SauceDemo.TestClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.SauceDemo.POMclass.POM01_LoginPage;
import com.SauceDemo.POMclass.POM02_HomePage;
import com.SauceDemo.POMclass.POM03_AddedToCartPage;
import com.SauceDemo.POMclass.POM04_CheckoutPage;
import com.SauceDemo.POMclass.POM05_OverviewPage;

public class TC05_OverviewPage
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\HOME\\SOFTWARE AS TESTER\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
		
		POM01_LoginPage lp = new POM01_LoginPage(driver);
		
		lp.sendUserName();
		
		lp.sendPassword();
		
		lp.clickloginbutton();
		
		POM02_HomePage hp=new POM02_HomePage(driver);
		hp.clickaddtocartbackpack();
		hp.cartbutton();
		
		POM03_AddedToCartPage acp = new POM03_AddedToCartPage(driver);
		acp.clickCheckout();
		
		
		POM04_CheckoutPage cp = new POM04_CheckoutPage(driver);
		
		cp.firstname1();
		cp.lastname1();
		cp.postalcode1();
		cp.continuebutton1();
		
		POM05_OverviewPage op = new POM05_OverviewPage(driver);
		op.finish1();
		
		
	}
}
