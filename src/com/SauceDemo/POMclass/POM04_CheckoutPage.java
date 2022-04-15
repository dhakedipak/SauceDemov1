package com.SauceDemo.POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM04_CheckoutPage 
{
	private WebDriver driver;
//	==================================================================================\\
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lastname;
	
	@FindBy (xpath="//input[@id='postal-code']")
	private WebElement postalcode;
//===================================================================================\\
	@FindBy (xpath="//input[@id='continue']")
	private WebElement continuebutton;
	@FindBy (xpath="//button[@id='cancel']")
	private WebElement cancelbutton;
//======================================================================================\\	

	public POM04_CheckoutPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	public void firstname1()
	{
		firstname.sendKeys("yeda");
	}
	public void lastname1()
	{
		lastname.sendKeys("anna");
	}
	public void postalcode1()
	{
		postalcode.sendKeys("123");
	}
	public void continuebutton1()
	{
		continuebutton.click();
	}

}
