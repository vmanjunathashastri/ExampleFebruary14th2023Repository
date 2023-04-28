package com.sgtesting.objectmape01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class object01map01 {
     public static   WebDriver l=null;
       public static Objectmap01 k=null;
	public static void main(String[] args) {
		launch();
		navigate();
		login01();
		usercreate();
		logout();

	}
	private static void launch()
	{
		try
		{
			l=new ChromeDriver();
			String filename01=".\\object01maps\\man.properties";
			k=new Objectmap01(filename01);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			l.get("http://localhost:81/login.do");
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
			l.findElement(k.getlocator01("getlonginusernames")).sendKeys("admin");
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getloginpassward")).sendKeys("manager");
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getloginclick")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void usercreate()
	{
		try
		{
			l.findElement(k.getlocator01("getclickonuser")).click();
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getadduserclick")).click();
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getuseronefirstname")).sendKeys("user1");
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getuserlastname")).sendKeys("us");
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getuserEmail")).sendKeys("user123@gmail.com");
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getusernameforuser")).sendKeys("user123");
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getusernamepassword")).sendKeys("123user");
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getusernamecopypassword")).sendKeys("123user");
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getaddusercreate")).click();
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getadduserclick")).click();
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getuseronefirstname")).sendKeys("user2");
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getuserlastname")).sendKeys("u2s");
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getuserEmail")).sendKeys("user1234@gmail.com");
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getusernameforuser")).sendKeys("user1234");
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getusernamepassword")).sendKeys("1234user");
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getusernamecopypassword")).sendKeys("1234user");
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getaddusercreate")).click();
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getadduserclick")).click();
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getuseronefirstname")).sendKeys("user3");
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getuserlastname")).sendKeys("u3s");
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getuserEmail")).sendKeys("user12345@gmail.com");
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getusernameforuser")).sendKeys("user12345");
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getusernamepassword")).sendKeys("12345user");
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getusernamecopypassword")).sendKeys("12345user");
			Thread.sleep(2000);
			l.findElement(k.getlocator01("getaddusercreate")).click();
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
			l.findElement(k.getlocator01("getout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
