package com.sgtesting.pageobjectmodel01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class actitime01 {

	public actitime01(WebDriver o) {
	
	
		PageFactory.initElements(o, this);

	}
	private WebElement username;
     public WebElement getuser()
     {
    	 return username;
     }

}
