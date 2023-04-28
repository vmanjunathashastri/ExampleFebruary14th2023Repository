package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class advanceAssignment1 {
    private static WebDriver br=null;
	public static void main(String[] args) {
		launch2();
		navigate2();
		login2();
		user1create();
		logout2();
		user1LnL();
		adminloginchangepassward();
		userloginAndlogout();
		deleteUser();
		closeapplication();
	}
	private static void launch2()
	{
		try
		{
			br=new ChromeDriver();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate2()
	{
		try
		{
			br.get("http://localhost:81/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login2()
	{
		try
		{
			br.findElement(By.name("username")).sendKeys("admin");
			br.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			br.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(10000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void user1create()
	{
		try
		{
			br.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			br.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			Thread.sleep(2000);
			br.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("user1");
			Thread.sleep(2000);
			br.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("1");
			Thread.sleep(2000);
			br.findElement(By.name("email")).sendKeys("user1@gmail.com");
			Thread.sleep(2000);
			br.findElement(By.id("userDataLightBox_usernameField")).sendKeys("user1");
			Thread.sleep(2000);
			br.findElement(By.name("password")).sendKeys("user123");
			Thread.sleep(2000);
			br.findElement(By.name("passwordCopy")).sendKeys("user123");
			Thread.sleep(2000);
			br.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(6000);
			br.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			Thread.sleep(2000);
			br.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("user2");
			Thread.sleep(2000);
			br.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("2");
			Thread.sleep(2000);
			br.findElement(By.name("email")).sendKeys("user2@gmail.com");
			Thread.sleep(2000);
			br.findElement(By.id("userDataLightBox_usernameField")).sendKeys("user2");
			Thread.sleep(2000);
			br.findElement(By.name("password")).sendKeys("user1234");
			Thread.sleep(2000);
			br.findElement(By.name("passwordCopy")).sendKeys("user1234");
			Thread.sleep(2000);
			br.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
			br.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			br.findElement(By.xpath("//*[@id='createUserDiv']/div")).click();
			Thread.sleep(2000);
			br.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("user3");
			Thread.sleep(2000);
			br.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("3");
			Thread.sleep(2000);
			br.findElement(By.name("email")).sendKeys("user3@gmail.com");
			Thread.sleep(2000);
			br.findElement(By.id("userDataLightBox_usernameField")).sendKeys("user3");
			Thread.sleep(2000);
			br.findElement(By.name("password")).sendKeys("user12345");
			Thread.sleep(2000);
			br.findElement(By.name("passwordCopy")).sendKeys("user12345");
			Thread.sleep(2000);
			br.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(6000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout2()
	{
		try
		{
			br.findElement(By.id("logoutLink")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void user1LnL()
	{
		try
		{
			br.findElement(By.name("username")).sendKeys("user1");
			Thread.sleep(2000);
			br.findElement(By.name("pwd")).sendKeys("user123");
			Thread.sleep(2000);
			br.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(10000);
			br.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
			Thread.sleep(2000);
			br.findElement(By.id("logoutLink")).click();
			Thread.sleep(5000);
			br.findElement(By.name("username")).sendKeys("user2");
			Thread.sleep(2000);
			br.findElement(By.name("pwd")).sendKeys("user1234");
			Thread.sleep(2000);
			br.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(10000);
			br.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
			Thread.sleep(2000);
			br.findElement(By.id("logoutLink")).click();
			Thread.sleep(10000);
			br.findElement(By.name("username")).sendKeys("user3");
			Thread.sleep(2000);
			br.findElement(By.name("pwd")).sendKeys("user12345");
			Thread.sleep(2000);
			br.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(10000);
			br.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div")).click();
			Thread.sleep(2000);
			br.findElement(By.id("logoutLink")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void adminloginchangepassward()
	{
		try
		{
			br.findElement(By.name("username")).sendKeys("admin");
			br.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			br.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
			br.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			br.findElement(By.xpath("//span[text()='1, user1']")).click();
			Thread.sleep(2000);
			br.findElement(By.name("password")).sendKeys("user321");
			Thread.sleep(2000);
			br.findElement(By.name("passwordCopy")).sendKeys("user321");
			Thread.sleep(2000);
			br.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(6000);
			br.findElement(By.xpath("//span[text()='2, user2']")).click();
			Thread.sleep(2000);
			br.findElement(By.name("password")).sendKeys("user4321");
			Thread.sleep(2000);
			br.findElement(By.name("passwordCopy")).sendKeys("user4321");
			Thread.sleep(2000);
			br.findElement(By.xpath("//span[text()='3, user3']")).click();
			Thread.sleep(2000);
			br.findElement(By.name("password")).sendKeys("user54321");
			Thread.sleep(2000);
			br.findElement(By.name("passwordCopy")).sendKeys("user54321");
			Thread.sleep(2000);
			br.findElement(By.id("logoutLink")).click();
			Thread.sleep(5000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void userloginAndlogout()
	{
		try
		{
			br.findElement(By.name("username")).sendKeys("user1");
			Thread.sleep(2000);
			br.findElement(By.name("pwd")).sendKeys("user321");
			Thread.sleep(2000);
			br.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(10000);
			br.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
			br.findElement(By.id("logoutLink")).click();
			Thread.sleep(5000);
			br.findElement(By.name("username")).sendKeys("user2");
			Thread.sleep(2000);
			br.findElement(By.name("pwd")).sendKeys("user4321");
			Thread.sleep(2000);
			br.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(10000);
			br.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
			br.findElement(By.id("logoutLink")).click();
			Thread.sleep(5000);
			br.findElement(By.name("username")).sendKeys("user3");
			Thread.sleep(2000);
			br.findElement(By.name("pwd")).sendKeys("user54321");
			Thread.sleep(2000);
			br.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(10000);
			br.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
			br.findElement(By.id("logoutLink")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser()
	{
		try
		{
			br.findElement(By.name("username")).sendKeys("admin");
			br.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			br.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
			br.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(2000);
			br.findElement(By.xpath("//span[text()='1, user1']")).click();
			Thread.sleep(2000);
			br.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			br.switchTo().alert().accept();
			Thread.sleep(2000);
			br.findElement(By.xpath("//span[text()='2, user2']")).click();
			Thread.sleep(2000);
			br.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			br.switchTo().alert().accept();
			Thread.sleep(2000);
			br.findElement(By.xpath("//span[text()='3, user3']")).click();
			Thread.sleep(2000);
			br.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			br.switchTo().alert().accept();
			Thread.sleep(2000);
			br.findElement(By.id("logoutLink")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeapplication()
	{
		try
		{
			br.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
