package com.sgtesting.objectmap02;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class modifyreference {
      Properties n=null;
   public modifyreference(String h)
   {
	   FileInputStream x=null;
	   {
		   try
		   {
			 x=new FileInputStream(h);
			 n=new Properties();
			 n.load(x);
		   }catch(Exception e)
		   {
			   e.printStackTrace();
		   }
	   }
   }

   


   public By getloc(String f)
   {
	   By by=null;
	   {
		   try
		   {
			  String locator=n.getProperty(f);
			  System.out.println(locator);
			  String locatordetails[]=locator.split(";");
			  String locatorname=locatordetails[0];
			  String locatervalue=locatordetails[1];
			  switch(locatorname.toLowerCase())
			  {
			  case "id":
			  by=By.id(locatervalue);
			  break;
			  case "name":
				  by=By.name(locatervalue);
				  break;
			  case "classname":
				  by=By.className(locatervalue);
				  break;
			  case "xpath":
				  by=By.xpath(locatervalue);
				  break;
			  case "linktext":
				  by=By.linkText(locatervalue);
				  break;
			  case "cssselector":
				  by=By.cssSelector(locatervalue);
				  break;
			  case "tagname":
				  by=By.tagName(locatervalue);
				  break;
			 
			  }
			  
			  
					  
		   }catch(Exception e)
		   {
			   e.printStackTrace();
		   }
		   return by;
	   }
   }
   
}
   

