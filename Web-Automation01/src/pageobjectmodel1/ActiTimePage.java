package pageobjectmodel1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	//WebElement for UserName Text Field
	private WebElement username;
	
	public WebElement getUsername()
	{
		return username;
	}
	
	//WebElement for passward text Feild
	
	private WebElement pwd;
	
	public WebElement getPassword()
	{
		return pwd;
	}
	//WebElement for login button
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	
	public WebElement getoLogin()
	{
		return oLogin;
	}
	
	private WebElement gettingStartedShortcutsPanelId;
	

	public WebElement getFlyOutwindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	//WebElement for log out link
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	
	public WebElement getlogout()
	{
		return oLogout;
	}

}
