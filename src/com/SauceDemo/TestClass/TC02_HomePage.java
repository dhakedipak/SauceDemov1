package com.SauceDemo.TestClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.SauceDemo.POMclass.POM01_LoginPage;
import com.SauceDemo.POMclass.POM02_HomePage;

public class TC02_HomePage 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\HOME\\SOFTWARE AS TESTER\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		System.out.println("1.Opening a Webbrowser is ok");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		POM01_LoginPage lp = new POM01_LoginPage(driver);
		System.out.println("2. create new constructor");
		lp.sendUserName();
		System.out.println("3.username Field is passed");
		lp.sendPassword();
		System.out.println("4.password Field is passed");
		lp.clickloginbutton();
		System.out.println("5. Login button is passed");
		
		POM02_HomePage hp=new POM02_HomePage(driver);
		hp.clickaddtocartbackpack();
		
		String actualURl= "https://www.saucedemo.com/inventory.html";
		String currentURl = driver.getCurrentUrl();		
		
		if (actualURl.equals(currentURl))
		{
			System.out.println("test case is passed");
		}
		else 
		{
			System.out.println("test case is failed");
		}
	
	
	}
	
	
	

}
