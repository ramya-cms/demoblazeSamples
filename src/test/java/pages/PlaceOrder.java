package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class PlaceOrder extends TestBase
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
	
	@FindBy(xpath="//button[normalize-space()='Place Order']")
	WebElement place;
	
	@FindBy(id="name")
	WebElement name;
	
	@FindBy(id="country")
	WebElement country;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="card")
	WebElement ccard;
	
	@FindBy(id="month")
	WebElement month;
	
	@FindBy(id="year")
	WebElement year;
	
	@FindBy(css="div#orderModal > div > div > div:nth-of-type(3) > button:nth-of-type(2)")
	WebElement purchase;
	
	@FindBy(xpath="//h2[contains(text(),'Thank you for your purchase!')]")
	WebElement thanku;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement ok;
	
	@FindBy(id="logout2")
	WebElement logout;
	
	
	public PlaceOrder() 
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
	
	public void purch()
	{
		place.click();
	}
	
	
	public void nme(String nam)
	{
		name.sendKeys(nam);
	}
	
	public void cont(String cn)
	{
		country.sendKeys(cn);
	}
	
	public void cit(String ct)
	{
		city.sendKeys(ct);
	}
	
	public void cred(String cc)
	{
		ccard.sendKeys(cc);
	}
	
	public void mon(String mn)
	{
		month.sendKeys(mn);
	}
	
	public void yer(String yr)
	{
		year.sendKeys(yr);
	}
	
	public void pur()
	{
		purchase.click();
	}
	
	public void tkalert()
	{
		 String act = thanku.getText();
	      System.out.println("Order purchased "+ act);
	}
	
	public void thkyou()
	{
		ok.click();
	}
	
	public void logout()
	{
		logout.click();
	}
}
