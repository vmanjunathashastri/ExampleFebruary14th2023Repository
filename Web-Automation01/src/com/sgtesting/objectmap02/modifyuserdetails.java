package com.sgtesting.objectmap02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class modifyuserdetails {
       private static WebDriver of=null;
       public static modifyreference oc=null;
	public static void main(String[] args) {
		launch02();
		navigate02();
		login02();
		user02();
		modify02();
		delete02();
		logout02();

	}
	private static void launch02()
	{
		try
		{
			of=new ChromeDriver();
			String f=".//mapobject//as.properties";
			oc=new modifyreference(f);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate02()
	{
		try
		{
			of.get("http://localhost:81/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login02()
	{
		try
		{
			of.findElement(oc.getloc("getlogusername")).sendKeys("admin");
			Thread.sleep(2000);
			of.findElement(oc.getloc("getlogpassword")).sendKeys("manager");
			Thread.sleep(2000);
			of.findElement(oc.getloc("getlog")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void user02()
	{
		try
		{
		of.findElement(oc.getloc("getuser")).click();
		Thread.sleep(2000);
		of.findElement(oc.getloc("getadduser")).click();
		Thread.sleep(2000);
		of.findElement(oc.getloc("getfirstname")).sendKeys("user1");
		Thread.sleep(2000);
		of.findElement(oc.getloc("getlastname")).sendKeys("us");
		Thread.sleep(2000);
		of.findElement(oc.getloc("getEmail")).sendKeys("user123@gmail.com");
		Thread.sleep(2000);
		of.findElement(oc.getloc("getusername")).sendKeys("user123");
		Thread.sleep(2000);
		of.findElement(oc.getloc("getpassword")).sendKeys("123user");
		Thread.sleep(2000);
		of.findElement(oc.getloc("getcopypassword")).sendKeys("123user");
		Thread.sleep(2000);
		of.findElement(oc.getloc("getcreate")).click();
		Thread.sleep(2000);
		of.findElement(oc.getloc("getadduser")).click();
		Thread.sleep(2000);
		of.findElement(oc.getloc("getfirstname")).sendKeys("user2");
		Thread.sleep(2000);
		of.findElement(oc.getloc("getlastname")).sendKeys("u2s");
		Thread.sleep(2000);
		of.findElement(oc.getloc("getEmail")).sendKeys("user1234@gmail.com");
		Thread.sleep(2000);
		of.findElement(oc.getloc("getusername")).sendKeys("user1234");
		Thread.sleep(2000);
		of.findElement(oc.getloc("getpassword")).sendKeys("1234user");
		Thread.sleep(2000);
		of.findElement(oc.getloc("getcopypassword")).sendKeys("1234user");
		Thread.sleep(2000);
		of.findElement(oc.getloc("getcreate")).click();
		Thread.sleep(2000);
		of.findElement(oc.getloc("getadduser")).click();
		Thread.sleep(2000);
		of.findElement(oc.getloc("getfirstname")).sendKeys("user3");
		Thread.sleep(2000);
		of.findElement(oc.getloc("getlastname")).sendKeys("u3s");
		Thread.sleep(2000);
		of.findElement(oc.getloc("getEmail")).sendKeys("user12345@gmail.com");
		Thread.sleep(2000);
		of.findElement(oc.getloc("getusername")).sendKeys("user12345");
		Thread.sleep(2000);
		of.findElement(oc.getloc("getpassword")).sendKeys("12345user");
		Thread.sleep(2000);
		of.findElement(oc.getloc("getcopypassword")).sendKeys("12345user");
		Thread.sleep(2000);
		of.findElement(oc.getloc("getcreate")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void modify02()
	{
		try
		{
			of.findElement(oc.getloc("getuser1modify")).click();
			Thread.sleep(2000);
			of.findElement(oc.getloc("getlastname")).clear();
			Thread.sleep(2000);
			of.findElement(oc.getloc("getlastname")).sendKeys("a");
			Thread.sleep(2000);
			of.findElement(oc.getloc("savechanges")).click();
			Thread.sleep(2000);
			of.findElement(oc.getloc("getuser2modify")).click();
			Thread.sleep(2000);
			of.findElement(oc.getloc("getlastname")).clear();
			Thread.sleep(2000);
			of.findElement(oc.getloc("getlastname")).sendKeys("b");
			Thread.sleep(2000);
			of.findElement(oc.getloc("savechanges")).click();
			Thread.sleep(2000);
			of.findElement(oc.getloc("getuser3modify")).click();
			Thread.sleep(2000);
			of.findElement(oc.getloc("getlastname")).clear();
			Thread.sleep(2000);
			of.findElement(oc.getloc("getlastname")).sendKeys("c");
			Thread.sleep(2000);
			of.findElement(oc.getloc("savechanges")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void delete02()
	{
		try
		{
			of.findElement(oc.getloc("getuser1modify")).click();
			Thread.sleep(2000);
			of.findElement(oc.getloc("getdelete")).click();
			Thread.sleep(5000);
			of.switchTo().alert().accept();
			of.findElement(oc.getloc("getuser2modify")).click();
			Thread.sleep(2000);
			of.findElement(oc.getloc("getdelete")).click();
			Thread.sleep(5000);
			of.switchTo().alert().accept();
			of.findElement(oc.getloc("getuser3modify")).click();
			Thread.sleep(2000);
			of.findElement(oc.getloc("getdelete")).click();
			Thread.sleep(5000);
			of.switchTo().alert().accept();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout02()
	{
		try
		{
			of.findElement(oc.getloc("getlogout")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	



}
