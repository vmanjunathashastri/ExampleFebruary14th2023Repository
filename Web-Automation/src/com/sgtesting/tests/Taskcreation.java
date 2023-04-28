package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taskcreation {
	   private static WebDriver browser=null;

	public static void main(String[] args) {
		lauch1();
		navigate1();
		login1();
		flyout1();
		createcustomer1();
		createproject1();
		createtask1();
		deletetask1();
		deleteproject1();
		logout1();
		closeapplication1();
	}
	private static void lauch1()
	{
		try
		{
			browser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void navigate1()
	{
		try
		{
			browser.get("http://localhost:81/login.do");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void login1()
	{
		try
		{
			browser.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(2000);
			browser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			browser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(10000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void flyout1()
	{
		try
		{
			browser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void createcustomer1()
	{
		try
		{
			browser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a")).click();
			Thread.sleep(2000);
			browser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div")).click();
			Thread.sleep(2000);
			browser.findElement(By.xpath("/html/body/div[12]/div[1]")).click();
			Thread.sleep(2000);
			browser.findElement(By.xpath("//*[@id='customerLightBox_nameField']")).sendKeys("sd solutins");
			Thread.sleep(2000);
			browser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("1234566");
			Thread.sleep(2000);
			browser.findElement(By.id("customerLightBox_commitBtn")).click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void createproject1()
	{
		try
		{
			browser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div")).click();
			Thread.sleep(2000);
			browser.findElement(By.xpath("/html/body/div[12]/div[2]")).click();
			Thread.sleep(2000);
			browser.findElement(By.id("projectPopup_projectNameField")).sendKeys("zxy");
			Thread.sleep(2000);
			browser.findElement(By.name("projectDescriptionField")).sendKeys("654123");
			Thread.sleep(2000);
			browser.findElement(By.id("projectPopup_commitBtn")).click();
			Thread.sleep(2000);
			browser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(5000);
			browser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).clear();
			Thread.sleep(2000);
			browser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).sendKeys("adf");
			Thread.sleep(2000);
			browser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[1]")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	private static void createtask1()
	{
		try
		{
		 browser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a")).click();
		 Thread.sleep(2000);
		 browser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[1]/div[3]/div")).click();
		 Thread.sleep(2000);
		 browser.findElement(By.xpath("/html/body/div[11]/div[1]")).click();
		 Thread.sleep(2000);
		 browser.findElement(By.xpath("//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input")).sendKeys("asdf");
		 Thread.sleep(2000);
		 browser.findElement(By.xpath("//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[2]/td[1]/input")).sendKeys("123456");
		 Thread.sleep(2000);
		 browser.findElement(By.xpath("//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[3]/td[1]/input")).sendKeys("789456123");
		 Thread.sleep(2000);
		 browser.findElement(By.id("createTasksPopup_commitBtn")).click();
		 Thread.sleep(10000);
		 
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deletetask1()
	{
		try
		{
			browser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr[1]/td[1]/div/div")).click();
			Thread.sleep(2000);
			browser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr[2]/td[1]/div/div")).click();
			Thread.sleep(2000);
			browser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr[3]/td[1]/div/div")).click();
			Thread.sleep(2000);
			browser.findElement(By.xpath("//span[text()='Delete']")).click();
			Thread.sleep(2000);
			browser.findElement(By.id("deleteTaskPopup_deleteConfirm_submitTitle")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteproject1()
	{
		try
		{
			browser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(5000);
			browser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(2000);
			browser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			browser.findElement(By.xpath("//*[@id='projectPanel_deleteConfirm_submitBtn']/div")).click();
			Thread.sleep(2000);
			browser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			browser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(2000);
			browser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			browser.findElement(By.xpath("//*[@id='customerPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(10000);
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
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	private static void closeapplication1()
	{
		try
		{
			browser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	

}
