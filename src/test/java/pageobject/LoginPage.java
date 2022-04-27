package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement paswword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnlogin;
	  
	@FindBy(xpath="//span[@class='hidden-xs']")
	WebElement actual; 
	
	
	public void setuser(String uname)
	{
		username.sendKeys(uname);
	}
	public void setpsw(String psw)
	{
		paswword.sendKeys(psw);
	}
	public void clickonlogin()
	{
		btnlogin.click();
	}
	public String actuals()
	{
		String a=actual.getText();
		return a;
	}
	
}
