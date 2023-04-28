package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxdemo1 {
	private static WebDriver browser=null;

	public static void main(String[] args) {
		launch1();
		navigate();
		lagin1();
		flymove ();
		logout1();

	}
	private static void launch1()
	{
		try
		{
			browser=new FirefoxDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			browser.get("http://localhost:81/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
	private static void lagin1()
	{
		try
		{
		browser.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(1000);
		browser.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(1000);
		browser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
		Thread.sleep(1000);
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void flymove ()
	{
		try
		{
			browser.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void logout1()
	{
		try
		{
			browser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}




}
