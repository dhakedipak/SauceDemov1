package com.SauceDemo.POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM05_OverviewPage 
{
	private WebDriver driver;
//	======================================================================\\
	@FindBy(xpath="//button[@id='finish']")
	private WebElement finish;
//	=======================================================================\\
	public POM05_OverviewPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void finish1()
	{
		finish.click();
	}
	
}
