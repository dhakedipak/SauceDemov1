package com.SauceDemo.POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM03_AddedToCartPage 
{
	private WebDriver driver;
//	===================================================================\\
	@FindBy(xpath="//button[@id='continue-shopping']")
	private WebElement continueshopping;
//	=======================================================================\\
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement Checkout;
//	====================================================================\\
	@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
	private WebElement removebag;
//==========================================================================\\	
	
	public POM03_AddedToCartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickCheckout()
	{
		Checkout.click();
	}
}
