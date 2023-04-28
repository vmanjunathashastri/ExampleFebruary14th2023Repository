package pageobjectmodel1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutdemo1 {
	public static WebDriver Obrowser=null;
	public static ActiTimePage opage=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		flyoutwindow();
		logout();
		closeApplication();
		
	}
	private static void launchBrowser()
	{
		try
		{
			Obrowser=new ChromeDriver();
			opage=new ActiTimePage(Obrowser);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			Obrowser.get("http://localhost:81/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			opage.getUsername().sendKeys("admin");
			opage.getPassword().sendKeys("manager");
			Thread.sleep(2000);
			opage.getoLogin().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void flyoutwindow()
	{
		try
		{
			opage.getFlyOutwindow().click();
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
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			Obrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
