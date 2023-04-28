package com.sgtesting.objectmap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginlogoutnew {
	private static WebDriver o=null;
	public static objectmapExcel om=null;

	public static void main(String[] args) {
		launch03();
		navigate03();
		login03();
		flyoutwindow03();
		logout03();

	}
	private static void launch03()
	{
		try
		{
			o=new ChromeDriver();
			String filename=".\\objectmape01\\objectmap.xlsx";
			om=new objectmapExcel(filename);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void navigate03()
	{
		try
		{
			o.get("http://localhost:81/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void login03()
	{
		try
		{
			o.findElement(om.getLocator("loginpageusername")).sendKeys("admin");
			Thread.sleep(5000);
			o.findElement(om.getLocator("loginpagepassword")).sendKeys("manager");
			Thread.sleep(2000);
		    o.findElement(om.getLocator("loginpageloginbtn")).click();
		    Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void flyoutwindow03()
	{
		try
		{
			o.findElement(om.getLocator("homepageflyoutwindow")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void logout03()
	{
		try
		{
			o.findElement(om.getLocator("homepagelogoutlnk")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
