package Demoblaze;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demoblazetest3 extends Demoblazebase {

	Demoblazelogin Loginobj;
	String actual_title;
	
	
	@BeforeClass
	public void Launch() throws IOException
	{
		initialization();
		Loginobj = new Demoblazelogin();
		
	}


	@AfterClass
	public void stop() throws IOException
	{
		terminate();	
	}
	
	
	@Test (priority=1)
	public void contactfunctionality() throws InterruptedException {
		Loginobj.contact2("", "", "");
		Thread.sleep(800);
		Alert alert = driver.switchTo().alert();		    
		String alertMessage= driver.switchTo().alert().getText();
		alert.accept();
		Assert.assertEquals(alertMessage,"Thanks for the message!!");
		Loginobj.cbtn();
		}
	
	@Test (priority=2)
	public void contactfunctionality2() throws InterruptedException {
		Loginobj.contact2("gunjot@gmail.com", "", "");
		Thread.sleep(800);
		Alert alert = driver.switchTo().alert();		    
		String alertMessage= driver.switchTo().alert().getText();
		alert.accept();
		Assert.assertEquals(alertMessage,"Thanks for the message!!");
		Loginobj.cbtn();
		}
	
	@Test (priority=3)
	public void contactfunctionality3() throws InterruptedException {
		Loginobj.contact2("", "Gunjot Singh", "");
		Thread.sleep(800);
		Alert alert = driver.switchTo().alert();		    
		String alertMessage= driver.switchTo().alert().getText();	
		alert.accept();
		Assert.assertEquals(alertMessage,"Thanks for the message!!");
		Loginobj.cbtn();
		}
	
	@Test (priority=4)
	public void contactfunctionality4() throws InterruptedException {
		Loginobj.contact2("", "", "What is your office address? Product 6 is great. Thank You !!!");
		Thread.sleep(800);
		Alert alert = driver.switchTo().alert();		    
		String alertMessage= driver.switchTo().alert().getText();
		Thread.sleep(1000);
		alert.accept();
		Assert.assertEquals(alertMessage,"Thanks for the message!!");
		Loginobj.cbtn();
		}
	
	@Test (priority=5)
	public void contactfunctionality5() throws InterruptedException {
		Loginobj.contact2("gunjot@gmail.com", "Gunjot Singh", "");
		Thread.sleep(800);
		Alert alert = driver.switchTo().alert();		    
		String alertMessage= driver.switchTo().alert().getText();
		alert.accept();
		Assert.assertEquals(alertMessage,"Thanks for the message!!");
		Loginobj.cbtn();
		}
	
	@Test (priority=6)
	public void contactfunctionality6() throws InterruptedException {
		Loginobj.contact2("gunjot@gmail.com", "", "What is your office address? Product 6 is great. Thank You !!!");
		Thread.sleep(800);
		Alert alert = driver.switchTo().alert();		    
		String alertMessage= driver.switchTo().alert().getText();
		alert.accept();
		Assert.assertEquals(alertMessage,"Thanks for the message!!");
		Loginobj.cbtn();
		}
	
	@Test (priority=7)
	public void contactfunctionality7() throws InterruptedException {
		Loginobj.contact2("", "Gunjot Singh", "What is your office address? Product 6 is great. Thank You !!!");
		Thread.sleep(800);
		Alert alert = driver.switchTo().alert();		    
		String alertMessage= driver.switchTo().alert().getText();
		alert.accept();
		Assert.assertEquals(alertMessage,"Thanks for the message!!");
		Loginobj.cbtn();
		}
	
	@Test (priority=8)
	public void contactfunctionality8() throws InterruptedException {
		Loginobj.contact2("gunjot@gmail.com", "Gunjot Singh", "What is your office address? Product 6 is great. Thank You !!!");
		Thread.sleep(800);
		Alert alert = driver.switchTo().alert();		    
		String alertMessage= driver.switchTo().alert().getText();
		alert.accept();
		Assert.assertEquals(alertMessage,"Thanks for the message!!");
		Loginobj.cbtn();
		}
}
