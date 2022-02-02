package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

import generic.Base_Page;

public class ActiTime_Login extends Base_Page
{
	@FindBy(id="email")
	private WebElement user;
	
	@FindBy(name="pass")
	private WebElement pass;
	
	@FindBy(name="login")
	private WebElement lgn_btn;
	
	public ActiTime_Login(WebDriver driver)
	{
		super(driver);
		//PageFactory.initElements(driver, this);
	}
	public void username(String usern)
	{
		user.sendKeys(usern);
	}
	public void password(String passw)
	{
		pass.sendKeys(passw);
	}
	public void login()
	{
		lgn_btn.click();
	}

}
