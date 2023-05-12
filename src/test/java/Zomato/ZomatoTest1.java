package Zomato;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ZomatoTest1 extends Zomatobase {

	Zomatologin Loginobj;
	String actual_title;


	@BeforeClass
	public void Launch() throws IOException
	{
		initialization();
		Loginobj = new Zomatologin();

	}


	@AfterClass
	public void stop() throws IOException
	{
		terminate();	
	}


	@Test (priority=1)
	public void searchlocationfunctionality1() throws InterruptedException {
		Loginobj.homefunc1();
		Thread.sleep(4000);
		Assert.assertEquals(Loginobj.requiredlocation.isDisplayed(),true);
	}

	@Test (priority=2)
	public void searchlocationfunctionality2() throws InterruptedException {
		Assert.assertEquals(Loginobj.requiredlocation.isEnabled(),true);
		Loginobj.requiredlocation.click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(10000);
	}

	@Test (priority=3)
	public void loginiconvisibility() throws InterruptedException {
		Assert.assertEquals(Loginobj.loginicon().isDisplayed(),true);
	}

	@Test (priority=4)
	public void loginiconclickability() throws InterruptedException {
		Assert.assertEquals(Loginobj.loginicon().isEnabled(),true);
	}

	@Test (priority=5)
	public void signupiconvisibility() throws InterruptedException {
		Assert.assertEquals(Loginobj.signupicon().isDisplayed(),true);
	}

	@Test (priority=6)
	public void signupiconclickability() throws InterruptedException {
		Assert.assertEquals(Loginobj.signupicon().isEnabled(),true);
	}

	@Test (priority=7)
	public void logovisibility() throws InterruptedException {
		Assert.assertEquals(Loginobj.logo().isDisplayed(),true);
	}

	@Test (priority=8)
	public void logoclickability() throws InterruptedException {
		Assert.assertEquals(Loginobj.logo().isEnabled(),true);
	}
	@Test (priority=9)
	public void deliveryiconvisibility() throws InterruptedException {
		Assert.assertEquals(Loginobj.deliveryicon().isDisplayed(),true);
	}

	@Test (priority=10)
	public void deliveryiconclickability() throws InterruptedException {
		Assert.assertEquals(Loginobj.deliveryicon().isEnabled(),true);
	}

	@Test (priority=11)
	public void diningouticonvisibility() throws InterruptedException {
		Assert.assertEquals(Loginobj.diningouticon().isDisplayed(),true);
	}

	@Test (priority=12)
	public void diningouticonclickability() throws InterruptedException {
		Assert.assertEquals(Loginobj.diningouticon().isEnabled(),true);
	}

	@Test (priority=13)
	public void nightlifeiconvisibility() throws InterruptedException {
		Assert.assertEquals(Loginobj.nightlifeicon().isDisplayed(),true);
	}

	@Test (priority=14)
	public void nightlifeiconclickability() throws InterruptedException {
		Assert.assertEquals(Loginobj.nightlifeicon().isEnabled(),true);
	}
	
	@Test (priority=15)
	public void filtericonvisibility() throws InterruptedException {
		Assert.assertEquals(Loginobj.filtericon().isDisplayed(),true);
	}

	@Test (priority=16)
	public void filtericonclickability() throws InterruptedException {
		Assert.assertEquals(Loginobj.filtericon().isEnabled(),true);
	}
	
	@Test (priority=17)
	public void ratingiconvisibility() throws InterruptedException {
		Assert.assertEquals(Loginobj.ratingicon().isDisplayed(),true);
	}

	@Test (priority=18)
	public void ratingiconclickability() throws InterruptedException {
		Assert.assertEquals(Loginobj.ratingicon().isEnabled(),true);
	}
	
	@Test (priority=19)
	public void purevegiconvisibility() throws InterruptedException {
		Assert.assertEquals(Loginobj.purevegicon().isDisplayed(),true);
	}

	@Test (priority=20)
	public void purevegiconclickability() throws InterruptedException {
		Assert.assertEquals(Loginobj.purevegicon().isEnabled(),true);
	}
	
	@Test (priority=21)
	public void cuisineiconvisibility() throws InterruptedException {
		Assert.assertEquals(Loginobj.cuisineicon().isDisplayed(),true);
	}

	@Test (priority=22)
	public void cuisineiconclickability() throws InterruptedException {
		Assert.assertEquals(Loginobj.cuisineicon().isEnabled(),true);
	}
	
	@Test (priority=23)
	public void morefiltersiconvisibility() throws InterruptedException {
		Assert.assertEquals(Loginobj.morefiltersicon().isDisplayed(),true);
	}

	@Test (priority=24)
	public void morefiltersiconclickability() throws InterruptedException {
		Assert.assertEquals(Loginobj.morefiltersicon().isEnabled(),true);
	}
}
