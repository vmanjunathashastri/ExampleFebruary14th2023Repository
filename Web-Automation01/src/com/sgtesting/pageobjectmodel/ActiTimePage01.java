package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage01 {
	public ActiTimePage01(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this );
	}
	private WebElement username;
	public WebElement getusername()
	{
		return username;
	}
	private WebElement pwd;
	public WebElement getpassword()
	{
		return pwd;
	}
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement Login ;
	public WebElement getlogin()
	{
		return Login ;
	}
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement flayoutwindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")
	private WebElement usercreate;
	public WebElement getusercreate()
	{
		return usercreate;
	}
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div")
	private WebElement adduser;
	public WebElement getadduser()
	{
		return adduser;
	}
	private WebElement userDataLightBox_firstNameField;
	public  WebElement getuser1()
	{
		return userDataLightBox_firstNameField;
	}
	
	private  WebElement userDataLightBox_lastNameField;
	public  WebElement getlastname()
	{
		return userDataLightBox_lastNameField;
	}
	private  WebElement userDataLightBox_emailField;
	public  WebElement getEmail()
	{
		return userDataLightBox_emailField;
	}
	private  WebElement userDataLightBox_usernameField;
	public  WebElement getUsername()
	{
		return userDataLightBox_usernameField;
	}
	private  WebElement userDataLightBox_passwordField;
	public  WebElement getPasswordforuser()
	{
		return userDataLightBox_passwordField;
	}
	private  WebElement userDataLightBox_passwordCopyField;
	public  WebElement getcopyPosswordForuser()
	{
		return userDataLightBox_passwordCopyField;
	}
	private  WebElement userDataLightBox_commitBtn;
	public  WebElement getCreateuser()
	{
	 return userDataLightBox_commitBtn;	
	}
	@FindBy(xpath="//span[text()='1, user1']")
	private  WebElement modifyuser1;
	public  WebElement getmodifyuser1()
	{
		return modifyuser1;
	}
	@FindBy(xpath="//span[text()='2, user2']")
	private  WebElement modifyuser2;
	public  WebElement getmodifyuser2()
	{
		return modifyuser2;
	}
	@FindBy(xpath="//span[text()='3, user3']")
	private  WebElement modifyuser3;
	public  WebElement getmodifyuser3()
	{
		return modifyuser3;
	}
	@FindBy(xpath="//span[text()='Save Changes']")
	private WebElement savechanges;
	public WebElement getsavechanges()
	{
		return savechanges;
	}
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getdelete1()
	{
		return userDataLightBox_deleteBtn;
	}
	
	
	private WebElement logoutLink;
	public WebElement getlogout()
	{
		return logoutLink;
	}
}


