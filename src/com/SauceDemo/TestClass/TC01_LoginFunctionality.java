package com.SauceDemo.TestClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMclass.POM01_LoginPage;
import com.SauceDemo.UtilityClass.SnapshotClass;

public class TC01_LoginFunctionality
{
	static WebDriver driver;
	@BeforeMethod
	public void setupmethod ()throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\HOME\\SOFTWARE AS TESTER\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test
	public void verifylogin() throws IOException
	{
		POM01_LoginPage lp = new POM01_LoginPage(driver);
		
		lp.sendUserName();
		
		lp.sendPassword();
		
		lp.clickloginbutton();
		
		
		
		SnapshotClass sp =new SnapshotClass();
		sp.Screenshot(driver);
		System.out.println("snapshot taken");
		
		
		
		String expectedHomePageUrl = "https://www.saucedemo.com/inventory.html";

		String actualHomePageUrl = driver.getCurrentUrl();
		{
			System.out.println(actualHomePageUrl);
		}

		System.out.println("6. Checking the logi test case");

		if (expectedHomePageUrl.equals(actualHomePageUrl)) 
		{
			System.out.println("7.login test passed-we have successfully login on sauce demo website");
		}
		else 
		{
			System.out.println("7.Login test failed");
		}
	}
		@AfterMethod
		public void tearDownMethod()
		{System.out.println("ok");System.out.println("ok");System.out.println("ok");
		System.out.println("ok");
		System.out.println("ok");
		System.out.println("ok");
		
			System.out.println("ok");
		    driver.quit();
		}
	}


