package com.SauceDemo.POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM01_LoginPage 
{
	private WebDriver driver;
//	===============================================================\\
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	
	@FindBy (xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy (xpath="//input[@id='login-button']")
	private WebElement loginbutton;
//	=================================================================\\
	
	public POM01_LoginPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
//	=======================================================================\\
//	public void sendUserName()
//	{
//		username.sendKeys("standard_user");
//	}
//	======================================================================\\
	public void sendPassword()
	{
		password.sendKeys("secret_sauce");
	}
//	==================================================================\\
	public void clickloginbutton()
	{
		loginbutton.click();
	}
//	===============================================================================\\
}
	


