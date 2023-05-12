package Demoblaze;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demoblazetest2 extends Demoblazebase {

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
	public void cartfunctionality2() throws InterruptedException {
		Loginobj.loginin(prop.getProperty("username3"), prop.getProperty("password1"));
		Assert.assertEquals(Loginobj.phones_sublist.isDisplayed(),true);
		}
	
	@Test (priority=2)
	public void cartfunctionality3() throws InterruptedException {
		Assert.assertEquals(Loginobj.phones_sublist.isEnabled(),true);
		}
	
	@Test (priority=3)
	public void cartfunctionality4() throws InterruptedException {
		Thread.sleep(1000);
		Assert.assertEquals(Loginobj.phone1.isDisplayed(),true);
		}
	
	@Test (priority=4)
	public void cartfunctionality5() throws InterruptedException {
		Assert.assertEquals(Loginobj.phone1.isEnabled(),true);
		}
	
	@Test (priority=5)
	public void cartfunctionality6() throws InterruptedException {
		Assert.assertEquals(Loginobj.phone2.isDisplayed(),true);
		}
	
	@Test (priority=6)
	public void cartfunctionality7() throws InterruptedException {
		Assert.assertEquals(Loginobj.phone2.isEnabled(),true);
		}
	
	@Test (priority=7)
	public void cartfunctionality8() throws InterruptedException {
		Assert.assertEquals(Loginobj.phone3.isDisplayed(),true);
		}
	
	@Test (priority=8)
	public void cartfunctionality9() throws InterruptedException {
		Assert.assertEquals(Loginobj.phone3.isEnabled(),true);
		}
	
	@Test (priority=9)
	public void cartfunctionality10() throws InterruptedException {
		Thread.sleep(2500);
		Loginobj.cfunc();
		Thread.sleep(2000);
	}
	
	@Test (priority=10)
	public void orderfunctionality1() throws InterruptedException {
		Loginobj.placeorderbtn();
		Thread.sleep(1000);
		Assert.assertEquals(Loginobj.name().isEnabled(),true);
		}
	
	@Test (priority=11)
	public void orderfunctionality2() throws InterruptedException {
		Assert.assertEquals(Loginobj.country().isEnabled(),true);
		}
	@Test (priority=12)
	public void orderfunctionality3() throws InterruptedException {
		Assert.assertEquals(Loginobj.city().isEnabled(),true);
		}
	@Test (priority=13)
	public void orderfunctionality4() throws InterruptedException {
		Assert.assertEquals(Loginobj.card().isEnabled(),true);
		}
	@Test (priority=14)
	public void orderfunctionality5() throws InterruptedException {
		Assert.assertEquals(Loginobj.month().isEnabled(),true);
		}
	@Test (priority=15)
	public void orderfunctionality6() throws InterruptedException {
		Assert.assertEquals(Loginobj.year().isEnabled(),true);
		}
	
	@Test (priority=16)
	public void orderfunctionality7() throws InterruptedException, IOException {
		Loginobj.pcorder("Gunjot", "Patiala", "India", "367543854384", "04-April", "2023");
		WebElement Logopic = Loginobj.receipt();
		File logo = Logopic.getScreenshotAs(OutputType.FILE);
		File trglogo = new File("D:\\eclipse\\Screenshot\\Receiptorder1.png");
		FileUtils.copyFile(logo, trglogo);
		System.out.println(Loginobj.receipt().getText());
		Assert.assertEquals(Loginobj.receipt().isDisplayed(),true);
		}
	
	@Test (priority=17)
	public void orderfunctionality8() throws InterruptedException, IOException {
		driver.navigate().refresh();
		Loginobj.home().click();
		Loginobj.cfunc();
		Loginobj.deletebtn();
		Loginobj.deletebtn();
		Thread.sleep(4000);
		Loginobj.placeorderbtn();
		Loginobj.pcorder("Gunjot", "Patiala", "India", "367543854384", "04-April", "2023");
		WebElement Logopic = Loginobj.receipt();
		File logo = Logopic.getScreenshotAs(OutputType.FILE);
		File trglogo = new File("D:\\eclipse\\Screenshot\\Receiptorder2.png");
		FileUtils.copyFile(logo, trglogo);
		System.out.println(Loginobj.receipt().getText());
		Assert.assertEquals(Loginobj.receipt().isDisplayed(),true);
		}
	
	}

