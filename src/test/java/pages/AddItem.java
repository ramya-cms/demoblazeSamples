package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class AddItem extends TestBase
{
	@FindBy(xpath="//a[@id='login2']")
	WebElement login;
	
	@FindBy(id="loginusername")
	WebElement usrname;
	
	@FindBy(id="loginpassword")
	WebElement pswd;
	
	@FindBy(xpath="//*[@id=\"logInModal\"]/div[1]/div[1]/div[3]/button[2]")
	WebElement log;
	
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	@FindBy(xpath="//*[@id=\"tbodyid\"]/div[1]/div[1]/div[1]/h4[1]")
	WebElement sam;
	
	@FindBy(xpath="//a[@class='btn btn-success btn-lg']")
	WebElement add;
	
	
	@FindBy(linkText="Cart")
	WebElement viewcart;
	
	@FindBy(xpath="//li[@class='nav-item active']//a[@class='nav-link']")
	WebElement home;
	
	@FindBy(xpath="//a[normalize-space()='Nokia lumia 1520']")
	WebElement nokia;
	
	@FindBy(id="logout2")
	WebElement logout;
	
	
	public AddItem() 
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
	
	
	public void samsung() 
	{
		js.executeScript("window.scrollBy(10, 500)","");
		sam.click();
	}
	
	
	public void additem()
	{
		add.click();
		
	}
	

	public void cart()
	{
		Alert simple = driver.switchTo().alert();
		simple.accept();
	}
	
	public void view()
	{
		viewcart.click();
	}
	
	
	public void home()
	{
		home.click();
		
	}
	
	public void nokia() 
	{
		js.executeScript("window.scrollBy(10, 500)","");
		nokia.click();
	}
	
	public void additems()
	{
		add.click();
		
	}

	public void carts()
	{
		Alert simple = driver.switchTo().alert();
		simple.accept();
	}
	
	public void viewcart()
	{
		viewcart.click();
		
	}
	
	public void logout()
	{
		logout.click();
	}
}
	

