package com.SauceDemo.TestClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.SauceDemo.POMclass.POM01_LoginPage;
import com.SauceDemo.POMclass.POM02_HomePage;

public class TC07_LogoutPage 
{
	public static void main(String[] args) throws InterruptedException 
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
	
	POM02_HomePage hp = new POM02_HomePage(driver);
	hp.clickmenubutton();
//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//	wait.until(ExpectedConditions.visibilityOf(null));
//	Thread.sleep(2000);
	hp.clicklogout();
	
	
	}

}
