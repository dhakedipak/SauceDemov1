package com.SauceDemo.POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM02_HomePage
{
	private WebDriver driver;
	
//====================================================================================//	
//	add to cart function
	
	@FindBy (xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement addtocartbackpack;
	
	@FindBy (xpath="//button[@id='add-to-cart-sauce-labs-bike-light']")
	private WebElement addtocartbikelight;
	
	@FindBy (xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	private WebElement addtocartbolttshirt;
	
	@FindBy (xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	private WebElement addtocartfleecejacket;
	
	@FindBy (xpath="//button[@id='add-to-cart-sauce-labs-onesie']")
	private WebElement addtocartonesie;
	
	@FindBy (xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
	private WebElement addtocarttshirtred;
//=======================================================================================//
//	remove from cart function on home page 
	@FindBy (xpath="//button[@id='remove-sauce-labs-backpack']")
	private WebElement removefromcartbackpack;
	
	@FindBy (xpath="//button[@id='remove-sauce-labs-bike-light']")
	private WebElement removefromcartbikelight;
	
	@FindBy (xpath="//button[@id='remove-sauce-labs-bolt-t-shirt']")
	private WebElement removefromcarttshirt;
	
	@FindBy (xpath="//button[@id='remove-sauce-labs-fleece-jacket']")
	private WebElement removefromcartjacket;
	
	@FindBy (xpath="//button[@id='remove-sauce-labs-onesie']")
	private WebElement removefromcartonesie;
	
	@FindBy (xpath="//button[@id='remove-test.allthethings()-t-shirt-(red)']")
	private WebElement removefromcartredtshirt;
	
//=======================================================================================\\
	
//	filter menu
	@FindBy (xpath="//select[@class='product_sort_container']")
	private WebElement filter;
	
	@FindBy (xpath="//option[@value='az']")
	private WebElement filteraz;
	
	@FindBy (xpath="//option[@value='za']")
	private WebElement filterza;
	
	@FindBy (xpath="//option[@value='lohi']")
	private WebElement filterlohi;
	
	@FindBy (xpath="//option[@value='hilo']")
	private WebElement filterhilo;
	
//	===================================================================================\\
	
//	menu button
	@FindBy (xpath="//button[@id='react-burger-menu-btn']")
	private WebElement menubutton;
	
	@FindBy (xpath="//a[@class='bm-item menu-item'][2]")
	private WebElement menubuttonabout;
	
	@FindBy (xpath="//a[@id='logout_sidebar_link']")
	private WebElement logout;
	
//=====================================================================================\\
//	cart button
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement cartbutton;
	
//=====================================================================================\\	
	
	public POM02_HomePage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
//=======================================================================================\\	
	public void clickaddtocartbackpack()
	{
		addtocartbackpack.click();
	}
	
	public void clickaddtocartbikelight()
	{
		addtocartbikelight.click();
	}
	public void clickaddtocartbolttshirt()
	{
		addtocartbolttshirt.click();
		
	}
	public void clickaddtocartfleecejacket()
	{
		addtocartfleecejacket.click();
		
	}
	public void clickaddtocartonesie()
	{
		addtocartonesie.click();
		
	}
	public void clickaddtocarttshirtred()
	{
		addtocarttshirtred.click();
		
	}
	
//===========================================================================\\
	
	public void clickfilter()
	{
		filter.click();
	}
	public void clickfilteraz()
	{
		filteraz.click();
	}
//===================================================================================\\
	
	public void clickmenubutton()
	{
		menubutton.click();
	}
	
	public void clicklogout()
	{
		logout.click();
	}

//	==================================================================================\\
	
	public void cartbutton()
	{
		cartbutton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

