package com.sgtesting.utility.FrameHandling;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {
	/*
	 * check frame available or not
	 */
	public static boolean isFramepresent(WebDriver oBrowser)
	{
		boolean status=false;
		try
		{
			List<WebElement> oFrames=oBrowser.findElements(By.tagName("iframe"));
			status=(oFrames.size()>0);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
	/**
	 * Find out no of Frames available in Given web page
	 */
	public static int getFramescount(WebDriver oBrowser)
	{
		int count=0;
		try
		{
			List<WebElement> oFrames=oBrowser.findElements(By.tagName("iframe"));
			count=oFrames.size();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return count;
	}
	/*
	 * switch to frame using WebElement
	 */
	public static boolean getFramescontrol(WebDriver oBrowser,WebElement oEle)
	{
		boolean status=false;
		try
		{
			oBrowser.switchTo().frame(oEle);
			status=true;
		}catch(Exception e)
		{
			status=false;
		}
		return status;
	}
	/*
	 * switch to frame using frame name
	 */
	public static boolean getFramescontrol(WebDriver oBrowser,String name)
	{
		boolean status=false;
		try
		{
			oBrowser.switchTo().frame(name);
			status=true;
		}catch(Exception e)
		{
			status=false;
		}
		return status;
	}
	/*
	 * switch to frames using index
	 */
	public static boolean getFramescontrol(WebDriver oBrowser,int index)
	{
		boolean status=false;
		try
		{
			oBrowser.switchTo().frame(index);
			status=true;
		}catch(Exception e)
		{
			status=false;
		}
		return status;
	}

}
