package com.sgtesting.popupsWindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupsWindowDemo1 {
   private static WebDriver b=null;
	public static void main(String[] args) {
		lauchbrowser();navigate();
		popupbrowser();
		getpopupscount();
		popupbrowserhandle();
		close();

	}
	private static void lauchbrowser()
	{
		try
		{
		b=new ChromeDriver();	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
		b.get("http://localhost:81/login.do");	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void popupbrowser()
	{
		try
		{
		b.findElement(By.linkText("actiTIME Inc.")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static int getpopupscount()
	{
		int count=0;
		count=b.getWindowHandles().size();
		return count;
	}
	private static void popupbrowserhandle()
	{
		try
		{
		String parentBrowser=b.getWindowHandle();
		System.out.println("parentBrowser"+parentBrowser);
		Thread.sleep(2000);
		Object childpopups[]=b.getWindowHandles().toArray();
		for( int i=1;i<childpopups.length;i++)
		{
			String childBrowser=childpopups[i].toString();
			System.out.println(childpopups[i]);
			b.switchTo().window(childBrowser);
			String title=b.getTitle();
			System.out.println(title);
			String u1=b.getCurrentUrl();
			System.out.println(u1);
			b.findElement(By.xpath("//a[text()='Try Free']")).click();
			Thread.sleep(2000);
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void close()
	{
		try
		{
		b.quit();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
