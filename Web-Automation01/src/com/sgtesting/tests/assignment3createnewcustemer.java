package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment3createnewcustemer {
	private static WebDriver obrowser=null;
	public static void main(String[] args) {
		launch2();
		navigate2();
		login2();
		flyout2();
		customercreation();
		
		

	}
	private static void launch2()
	{
		try
		{
			obrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void navigate2()
	{
		try
		{
			obrowser.get("http://localhost:81/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void login2()
	{
		try
		{
			obrowser.findElement(By.name("username")).sendKeys("admin");
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			obrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void flyout2()
	{
		try
		{
		obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void customercreation()
	{
		try
		{
		obrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a")).click();
		Thread.sleep(1000);
		obrowser.findElement(By.xpath("//div[text()='Add New']")).click();
		Thread.sleep(1000);
		obrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
		Thread.sleep(1000);
		obrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("ABJ solutions");
		Thread.sleep(1000);
		obrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("web page design");
		Thread.sleep(1000);
		obrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
		Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
