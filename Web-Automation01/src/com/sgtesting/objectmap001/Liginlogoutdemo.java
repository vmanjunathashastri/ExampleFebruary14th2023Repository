package com.sgtesting.objectmap001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Liginlogoutdemo {
	private static WebDriver oBrowser=null;
	public static ObjectMap om=null;

	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login01();
		flyout();
		logout();

	}
	private static void launchbrowser() {
		
		try
		{
		oBrowser=new ChromeDriver();
		String filename=".\\objectmape01\\om.properties";
		om=new ObjectMap(filename);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
	try
	{
		oBrowser.get("http://localhost:81/login.do");
		Thread.sleep(5000);
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	private static void login01()
	{
	try
	{
		oBrowser.findElement(om.getlocator("loginpageusername")).sendKeys("admin");
		Thread.sleep(2000);
		oBrowser.findElement(om.getlocator("loginpagepassword")).sendKeys("manager");
		Thread.sleep(2000);
		oBrowser.findElement(om.getlocator("loginpageloginbtn")).click();
		Thread.sleep(5000);
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	private static void flyout()
	{
	try
	{
		oBrowser.findElement(om.getlocator("homepageflyoutwindow")).click();
		Thread.sleep(2000);
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	private static void logout()
	{
	try
	{
		oBrowser.findElement(om.getlocator("homepagelogoutlink")).click();
		Thread.sleep(2000);
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	}


}
