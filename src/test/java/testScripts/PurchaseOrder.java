package testScripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.AddItem;
import pages.DeleteItem;
import pages.PlaceOrder;



public class PurchaseOrder extends TestBase
{
	
	AddItem addItem;
	DeleteItem delItem;
	PlaceOrder plcOrder;
	@BeforeTest
	  public void setup()
	{
		initialize();  
	 }
	
	@Test(priority=1)
	 public void addCart() throws InterruptedException
	{
		addItem = new AddItem();
		addItem.login();
		Thread.sleep(1000);
		addItem.usrnme("ramyas");
		addItem.password("Password@1");
		addItem.submit();
		
		Thread.sleep(1000);
		addItem.samsung();
		addItem.additem();
		Thread.sleep(2000);
		addItem.cart();
		Thread.sleep(1000);
		addItem.view();
		Thread.sleep(2000);
		addItem.home();
		Thread.sleep(2000);
		addItem.nokia();
		Thread.sleep(2000);
		addItem.additems();
		Thread.sleep(2000);
		addItem.carts();
		Thread.sleep(2000);
		addItem.viewcart();
		addItem.logout();
		
		
	}
	
	@Test(priority=2)
	public void delCart() throws InterruptedException
	{
		delItem = new DeleteItem();
		
		delItem.login();
		Thread.sleep(1000);
		delItem.usrnme("ramyas");
		delItem.password("Password@1");
		delItem.submit();
		
	
		Thread.sleep(1000);
		delItem.view();
		Thread.sleep(2000);
		delItem.delete();
		Thread.sleep(2000);
		delItem.logout();

	
	}
	
	@Test(priority=3)
	public void placeOrder() throws InterruptedException
	{
		plcOrder = new PlaceOrder();
		Thread.sleep(1000);
		plcOrder.login();
		Thread.sleep(1000);
		plcOrder.usrnme("ramyas");
		plcOrder.password("Password@1");
		plcOrder.submit();
		
		Thread.sleep(1000);
		plcOrder.view();
		Thread.sleep(2000);
		
		plcOrder.purch();
		Thread.sleep(2000);
		plcOrder.nme("Ram");
		Thread.sleep(2000);
		plcOrder.cont("India");
		Thread.sleep(1000);
		plcOrder.cit("Bengaluru");
		Thread.sleep(1000);
		plcOrder.cred("5123456789012346");
		Thread.sleep(1000);
		plcOrder.mon("12");
		Thread.sleep(1000);
		plcOrder.yer("2023");
		Thread.sleep(1000);
		plcOrder.pur();
		Thread.sleep(1000);
		plcOrder.tkalert();
		Thread.sleep(1000);
		plcOrder.thkyou();
		Thread.sleep(1000);
		plcOrder.logout();
		
		
	}
	
	 @AfterTest
	  public void tearDown()
	 {
		  closeBrowser();
	 }

}