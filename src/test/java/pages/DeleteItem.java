package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class DeleteItem extends TestBase
{
	@FindBy(xpath="//a[@id='login2']")
	WebElement login;
	
	@FindBy(id="loginusername")
	WebElement usrname;
	
	@FindBy(id="loginpassword")
	WebElement pswd;
	
	@FindBy(xpath="//*[@id=\"logInModal\"]/div[1]/div[1]/div[3]/button[2]")
	WebElement log;
	
	@FindBy(linkText="Cart")
	WebElement viewcart;
	
	@FindBy(xpath="//a[normalize-space()='Delete']")
	WebElement del;

	@FindBy(id="logout2")
	WebElement logout;
	
	public DeleteItem() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login() 
	{
		login.click();
		
	}
	
	public void usrnme(String usrnme)
	
	{
		usrname.sendKeys(usrnme);
	}
		
	public void password(String paswd)
	{
		pswd.sendKeys(paswd);
	}
	
	public void submit()
	{
		log.click();
	}
	
	public void view()
	{
		viewcart.click();
	}
	
	
	public void delete()
	{
		del.click();
	}
	
	public void logout()
	{
		logout.click();
	}
	
	
}
