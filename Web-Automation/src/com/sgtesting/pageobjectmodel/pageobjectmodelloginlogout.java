package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageobjectmodelloginlogout {
	public static  WebDriver browser=null;
    public static ActiTimePage01 opage=null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		usercreation();
		user2();
		user3();
		modify1();
		modify2();
		modify3();
		deleteuser1();
		logout();
		

	}
	private static void launchbrowser()
	{
		try
		{
			browser=new ChromeDriver();
			opage=new ActiTimePage01(browser);
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
	
	private static void login()
	{
		try
		{
			opage.getusername().sendKeys("admin");
			opage.getpassword().sendKeys("manager");
			opage.getlogin().click();
			Thread.sleep(10000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void usercreation()
	{
		try
		{
			opage.getusercreate().click();
			Thread.sleep(2000);
			opage.getadduser().click();
			Thread.sleep(2000);
			opage.getuser1().sendKeys("user1");
			Thread.sleep(2000);
			opage.getlastname().sendKeys("1");
			Thread.sleep(2000);
			opage.getEmail().sendKeys("user123@gmail.com");
			Thread.sleep(2000);
			opage.getUsername().sendKeys("user123");
			Thread.sleep(2000);
			opage.getPasswordforuser().sendKeys("user321");
			Thread.sleep(2000);
			opage.getcopyPosswordForuser().sendKeys("user321");
			Thread.sleep(2000);
			opage.getCreateuser().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
	}
		}
	private static void user2()
	{
		try
		{
			opage.getusercreate().click();
			Thread.sleep(2000);
			opage.getadduser().click();
			Thread.sleep(2000);
			opage.getuser1().sendKeys("user2");
			Thread.sleep(2000);
			opage.getlastname().sendKeys("2");
			Thread.sleep(2000);
			opage.getEmail().sendKeys("user1234@gmail.com");
			Thread.sleep(2000);
			opage.getUsername().sendKeys("user1234");
			Thread.sleep(2000);
			opage.getPasswordforuser().sendKeys("user4321");
			Thread.sleep(2000);
			opage.getcopyPosswordForuser().sendKeys("user4321");
			Thread.sleep(2000);
			opage.getCreateuser().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void user3()
	{
		try
		{
			opage.getusercreate().click();
			Thread.sleep(2000);
			opage.getadduser().click();
			Thread.sleep(2000);
			opage.getuser1().sendKeys("user3");
			Thread.sleep(2000);
			opage.getlastname().sendKeys("3");
			Thread.sleep(2000);
			opage.getEmail().sendKeys("user12345@gmail.com");
			Thread.sleep(2000);
			opage.getUsername().sendKeys("user12345");
			Thread.sleep(2000);
			opage.getPasswordforuser().sendKeys("user54321");
			Thread.sleep(2000);
			opage.getcopyPosswordForuser().sendKeys("user54321");
			Thread.sleep(2000);
			opage.getCreateuser().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modify1()
	{
		try
		{
			opage.getmodifyuser1().click();
			Thread.sleep(2000);
			opage.getPasswordforuser().sendKeys("user123");
			Thread.sleep(2000);
			opage.getcopyPosswordForuser().sendKeys("user123");
			Thread.sleep(2000);
			opage.getsavechanges().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modify2()
	{
		try
		{
			opage.getmodifyuser1().click();
			Thread.sleep(2000);
			opage.getPasswordforuser().sendKeys("user1234");
			Thread.sleep(2000);
			opage.getcopyPosswordForuser().sendKeys("user1234");
			Thread.sleep(2000);
			opage.getsavechanges().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modify3()
	{
		try
		{
			opage.getmodifyuser1().click();
			Thread.sleep(2000);
			opage.getPasswordforuser().sendKeys("user12345");
			Thread.sleep(2000);
			opage.getcopyPosswordForuser().sendKeys("user12345");
			Thread.sleep(2000);
			opage.getsavechanges().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser1()
	{
		try
		{
			opage.getmodifyuser1().click();
			Thread.sleep(2000);
			opage.getdelete1().click();
			Thread.sleep(2000);
			browser.switchTo().alert().accept();
			Thread.sleep(2000);
			opage.getmodifyuser2().click();
			Thread.sleep(2000);
			opage.getdelete1().click();
			Thread.sleep(2000);
			browser.switchTo().alert().accept();
			Thread.sleep(2000);
			opage.getmodifyuser3() .click();
			Thread.sleep(2000);
			opage.getdelete1().click();
			Thread.sleep(2000);
			browser.switchTo().alert().accept();
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
			opage.getlogout().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	

}
