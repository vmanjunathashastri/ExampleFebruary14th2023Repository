package com.sgtesting.frames;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingDemo {
	private static WebDriver o=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		HandleFrames();

	}
	private static void launchBrowser()
	{
		try
		{
			o=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			o.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void HandleFrames()
	{
		try
		{
			o.switchTo().frame(0);
			o.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
			o.switchTo().defaultContent();
			Thread.sleep(5000);
			o.switchTo().frame(1);
			o.findElement(By.xpath("//span[text()='WebDriver']")).click();
			o.switchTo().defaultContent();
			Thread.sleep(5000);
			WebElement of=o.findElement(By.className("rightIframe"));
			o.switchTo().frame(of);
			String p=o.findElements(By.xpath("/html/body/main/div")).toString();
			System.out.println(p);
	
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
