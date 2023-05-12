package Maven.Saucedemo;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Saucedemotest extends Saucedemobase {
	
   	Saucedemologin Lp;

	@BeforeSuite
	public void Launch() throws IOException
	{
		initialization();
		Lp = new Saucedemologin();	
	}
	
	@AfterSuite
	public void stop() throws IOException
	{
		terminate();	
	}
	
//	@AfterTest
//	public void back() throws InterruptedException
//	{
//		driver.navigate().back();
//	}
	
  @Test
  //Case of valid username and valid password 1 
  public void successfullogin1() throws InterruptedException {
	  	Lp.setUsername(prop.getProperty("username1"));
		Lp.setPassword(prop.getProperty("password1"));
		Lp.clickSubmit();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html");
		System.out.println("Successful login on entering valid username and valid password (Case1)");
		driver.navigate().back();
		//Thread.sleep(5000);
  }
  
  @Test
  //Case of valid username and valid password 1 
  public void successfullogin2() throws InterruptedException {
	  	Lp.setUsername(prop.getProperty("username2"));
		Lp.setPassword(prop.getProperty("password1"));
		Lp.clickSubmit();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html");
		System.out.println("Successful login on entering valid username and valid password (Case2)");
		driver.navigate().back();
//		Thread.sleep(5000);
  }
  
  @Test
  //Case of valid username and valid password 1 
  public void successfullogin3() throws InterruptedException {
	  	Lp.setUsername(prop.getProperty("username3"));
		Lp.setPassword(prop.getProperty("password1"));
		Lp.clickSubmit();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html");
		System.out.println("Successful login on entering valid username and valid password (Case3)");
		driver.navigate().back();
//		Thread.sleep(5000);
  }
  
  @Test
  //Case of valid username and valid password 1 
  public void unsuccessfullogin1() throws InterruptedException {
	  	Lp.setUsername(prop.getProperty("username4"));
		Lp.setPassword(prop.getProperty("password1"));
		Lp.clickSubmit();
		Assert.assertEquals(Lp.checkerrorPresence(),true);
		System.out.println("Unsuccessful login on entering invalid username and valid password");
		driver.navigate().refresh();
//		Thread.sleep(5000);
  }
  
  @Test
  //Case of valid username and valid password 1 
  public void unsuccessfullogin2() throws InterruptedException {
	  	Lp.setUsername(prop.getProperty("username4"));
		Lp.setPassword(prop.getProperty("password2"));
		Lp.clickSubmit();
		Assert.assertEquals(Lp.checkerrorPresence(),true);
		System.out.println("Unsuccessful login on entering invalid username and invalid password");
		driver.navigate().back();
//		Thread.sleep(5000);
  }
  
}
