package com.SauceDemo.POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM06_CompletePage 
{
    private WebDriver driver;
//    ====================================================================\\
    @FindBy(xpath="//button[@id='back-to-products']")
    private WebElement backbutton;

	//  =======================================================================\\
    public POM06_CompletePage(WebDriver driver)
    {
    	this.driver =driver;
    	PageFactory.initElements(driver,this);
    }
    public void backbutton1()
    {
    backbutton.click();
    }
}
