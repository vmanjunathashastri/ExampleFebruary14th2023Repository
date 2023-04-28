package com.sgtesting.utility.FrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilityDemo {
    private static WebDriver oBrowser=null;
    
	public static void main(String[] args) {
		launchBrowser03();
		navigate03();
		frameshandle();

	}
	/*
	 * check frame available or not
	 */
	private static void launchBrowser03()
	{
		try
		{
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate03()
	{
		try
		{
	     oBrowser.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	     Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Find out no of Frames available in Given web page
	 */
	private static void frameshandle()
	{
		try
		{
	     boolean v1=Utility.isFramepresent(oBrowser);
	     if(v1)
	     {
	    	System.out.println("Frames present  ");
	    	System.out.println(Utility.getFramescount(oBrowser));
	    
	     }
	     else
	     {
	    	 System.out.println("Frames not found");
	     }
	     WebElement oEle=oBrowser.findElement(By.xpath("/html/body/main/div/div[1]/div[1]/iframe"));
	     boolean status=Utility.getFramescontrol(oBrowser, oEle);
	     if(status)
	     {
	    	 oBrowser.findElement(By.linkText("org.openqa.selenium")).click();
	     }
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
