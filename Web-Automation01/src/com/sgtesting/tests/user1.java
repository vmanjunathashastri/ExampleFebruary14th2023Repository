package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class user1 {
	private static WebDriver browser=null;

	public static void main(String[] args) {
		launch1();
		navigate();
		login1();
		flyoutwindow1();
		usercreate();
		deleteuser();
		logout1();
		closebrowser1();

	}
	private static void launch1()
	{
		try
		{

			browser=new ChromeDriver();

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
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login1()
	{
		try
		{
			browser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(1000);
			browser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			browser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void flyoutwindow1()
	{
		try
		{
			browser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void usercreate()
	{
		try
		{
			browser.findElement(By.xpath("//div[text()='USERS']")).click();
			browser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			browser.findElement(By.name("firstName")).sendKeys("tom");
			browser.findElement(By.name("lastName")).sendKeys("jerry");
			browser.findElement(By.name("email")).sendKeys("tomandjerry@gmail.com");
			browser.findElement(By.name("username")).sendKeys("tomandjerry");
			browser.findElement(By.name("password")).sendKeys("123456");
			browser.findElement(By.name("passwordCopy")).sendKeys("123456");
			Thread.sleep(3000);
			browser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try
		{
			browser.findElement(By.xpath("//span[text()='jerry, tom']")).click();
			Thread.sleep(1000);
			browser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			browser.switchTo().alert().accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout1()
	{
		try
		{
			browser.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
	    }catch(Exception e)
		{
	    	e.printStackTrace();
		}
	
		
	}
	private static void closebrowser1()
	{
		try
		{
			browser.close();
			Thread.sleep(2000);
	    }catch(Exception e)
		{
	    	e.printStackTrace();
		}
	}
}
