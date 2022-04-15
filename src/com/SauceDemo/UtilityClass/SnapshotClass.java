package com.SauceDemo.UtilityClass;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class SnapshotClass 
{		
//	static WebDriver driver;

	  
	 public static void Screenshot(WebDriver driver) throws IOException
	{
//		 Date date = new Date();
//		 DateFormat f = new SimpleDateFormat("DD-mm-yy& HH-mm-ss");
//		 String newDate =f.format(date);
		 
		 TakesScreenshot t= (TakesScreenshot)driver;
		 File source = t.getScreenshotAs(OutputType.FILE);
		 File dest = new File ("D:\\SOFTWARE TESTER\\JAVA\\SELENIUM SNAPSHOT\\path3.jpg");
		 FileHandler.copy(source, dest);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
//		 Date date = new Date();
//		 DateFormat f= new SimpleDateFormat("mmddyyyy_hhmmss");
//		 String date1 =f.format(date);
//		 
//		TakesScreenshot t =(TakesScreenshot)driver;
//		File sourceFile = t.getScreenshotAs(OutputType.FILE);
//		File destFile = new File ("D:\\HOME\\SOFTWARE AS TESTER\\chromedriver\\chromedriver.jpg");
//		FileHandler.copy(sourceFile, destFile);
	}

}
