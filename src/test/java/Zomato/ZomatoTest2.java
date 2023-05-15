package Zomato;

import java.io.IOException;
import java.io.ObjectInputFilter.Status;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ZomatoTest2 extends Zomatobase {

	Zomatologin Loginobj;
	String actual_title;
	public ExtentTest test;
	public ExtentReports extent;


	@BeforeClass
	public void Launch() throws IOException
	{
		initialization();
		Loginobj = new Zomatologin();
		extent= new ExtentReports("D:\\workspace\\Saucedemo\\ereport\\zomatologin.html", true);
	}


	@AfterClass
	public void stop() throws IOException
	{
		terminate();
		extent.endTest(test);
		extent.flush();
	}


	@Test (priority=1)
	public void searchlocationfunctionality1() throws InterruptedException {
		test=extent.startTest("Verify website proceeds to desired location successfully");
		test.log(LogStatus.INFO,"Verify location is accessed");
		Loginobj.homefunc1();
		Thread.sleep(4000);
		if(Loginobj.requiredlocation.isDisplayed()==true) {
			test.log(LogStatus.PASS, "Location is accessed");
		} else {
			test.log(LogStatus.FAIL, "Location is not accessed");
		}
		Assert.assertEquals(Loginobj.requiredlocation.isDisplayed(),true);
	}

	@Test (priority=2)
	public void signupfunctionality() throws InterruptedException {
		test=extent.startTest("Test2");
		test.log(LogStatus.INFO,"successful sign up");
		Loginobj.f2();
		Loginobj.setsignup(prop.getProperty("signname"), prop.getProperty("SignNewMail"));
		Thread.sleep(4000);
		if(Loginobj.signupotp.isDisplayed()==true) {
			test.log(LogStatus.PASS, "test passed");
		} else {
			test.log(LogStatus.FAIL, "test failed");
		}
		Assert.assertEquals(Loginobj.signupotp.isDisplayed(),true);
		driver.navigate().refresh();
	}

	@Test (priority=3)
	public void signupfunctionality2() throws InterruptedException {
		test=extent.startTest("Test3");
		Loginobj.signupicon.click();
		Loginobj.setsignup(prop.getProperty("signname"), prop.getProperty("SignOldMail"));
		Thread.sleep(4000);
		if(Loginobj.signupmailregistered.isDisplayed()==true) {
			test.log(LogStatus.PASS, "test passed");
		} else {
			test.log(LogStatus.FAIL, "test failed");
		}
		Assert.assertEquals(Loginobj.signupmailregistered.isDisplayed(),true);
		driver.navigate().refresh();
	}

	@Test (priority=4)
	public void signupfunctionality3() throws InterruptedException {
		test=extent.startTest("Test4");
		Loginobj.signupicon.click();
		Loginobj.setsignup2("", prop.getProperty("SignOldMail"));
		Thread.sleep(4000);
		if(Loginobj.signupinvalidname.isDisplayed()==true) {
			test.log(LogStatus.PASS, "test passed");
		} else {
			test.log(LogStatus.FAIL, "test failed");
		}
		Assert.assertEquals(Loginobj.signupinvalidname.isDisplayed(),true);
		driver.navigate().refresh();
	}

	@Test (priority=5)
	public void signupfunctionality4() throws InterruptedException {
		test=extent.startTest("Test5");
		Loginobj.signupicon.click();
		Loginobj.setsignup2(prop.getProperty("signname"),"fghfd");
		Loginobj.signupcheckbox.click();
		Thread.sleep(4000);
		if(Loginobj.signupinvalidmail.isDisplayed()==true) {
			test.log(LogStatus.PASS, "test passed");
		} else {
			test.log(LogStatus.FAIL, "test failed");
		}
		Assert.assertEquals(Loginobj.signupinvalidmail.isDisplayed(),true);
		driver.navigate().refresh();
	}

	@Test (priority=6)
	public void signupfunctionality5() throws InterruptedException {
		test=extent.startTest("Test6");
		Loginobj.signupicon.click();
		Loginobj.setsignup2("","");
		Thread.sleep(4000);
		if(Loginobj.signupinvalidname.isDisplayed()==true) {
			test.log(LogStatus.PASS, "test passed");
		} else {
			test.log(LogStatus.FAIL, "test failed");
		}
		Assert.assertEquals(Loginobj.signupinvalidname.isDisplayed(),true);
		driver.navigate().refresh();
	}

	@Test (priority=7)
	public void signupfunctionality6() throws InterruptedException {
		test=extent.startTest("Test7");
		Loginobj.signupicon.click();
		Loginobj.setsignup2(prop.getProperty("signname"), prop.getProperty("SignNewMail"));
		Thread.sleep(4000);
		if(Loginobj.signupsubmit.isEnabled()==true) {
			test.log(LogStatus.PASS, "test passed");
		} else {
			test.log(LogStatus.FAIL, "test failed");
		}
		Assert.assertEquals(Loginobj.signupsubmit.isEnabled(),true);
	}

	@Test (priority=8)
	public void loginfunctionality1() throws InterruptedException {
		test=extent.startTest("Verify OTP is recieved on entering contact number in login section");
		driver.navigate().refresh();
		Loginobj.loginicon.click();
		Thread.sleep(2000);
		driver.switchTo().frame("auth-login-ui");
		Loginobj.setlogin(prop.getProperty("numberl"));
		Thread.sleep(2000);
		if(Loginobj.loginotp.isDisplayed()==true) {
			test.log(LogStatus.PASS, "Test Passed");
		} else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
		Assert.assertEquals(Loginobj.loginotp.isDisplayed(),true);
		driver.navigate().refresh();
	}
	@Test (priority=9)
	public void loginfunctionality2() throws InterruptedException {
		test=extent.startTest("Verify OTP is not recieved on entering blank contact number in login section");
		driver.navigate().refresh();
		Loginobj.loginicon.click();
		Thread.sleep(3000);
		driver.switchTo().frame("auth-login-ui");
		Loginobj.setlogin("");
		Thread.sleep(2000);
		if(Loginobj.loginprompt.isDisplayed()==true) {
			test.log(LogStatus.PASS, "Test Passed");
		} else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
		Assert.assertEquals(Loginobj.loginprompt.isDisplayed(),true);
		driver.navigate().refresh();
	}
	
	@Test (priority=10)
	public void loginfunctionality3() throws InterruptedException {
		test=extent.startTest("Verify Login by mail option leads to email prompt on clicking it");
		Loginobj.loginicon.click();
		Thread.sleep(3000);
		driver.switchTo().frame("auth-login-ui");
		Loginobj.loginbymail.click();
		Thread.sleep(2000);
		if(Loginobj.loginmail.isDisplayed()==true) {
			test.log(LogStatus.PASS, "Test Passed");
		} else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
		Assert.assertEquals(Loginobj.loginmail.isDisplayed(),true);
		
	}
	
	@Test (priority=11)
	public void loginfunctionality4() throws InterruptedException {
		test=extent.startTest("Verify OTP is recieved on entering registered mail-id in login section");
		Loginobj.loginmail.sendKeys("puneet@gmail.com");
		Loginobj.loginsubmit().click();
		Thread.sleep(2000);
		if(Loginobj.loginotp.isDisplayed()==true) {
			test.log(LogStatus.PASS, "Test Passed");
		} else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
		Assert.assertEquals(Loginobj.loginotp.isDisplayed(),true);
		driver.navigate().refresh();
	}
	
	@Test (priority=12)
	public void loginfunctionality5() throws InterruptedException {
		test=extent.startTest("Verify OTP is not recieved on entering unregistered mail-id in login section");
		Loginobj.loginicon.click();
		Thread.sleep(3000);
		driver.switchTo().frame("auth-login-ui");
		Loginobj.loginbymail.click();
		Loginobj.loginmail.sendKeys("mangopeas@gmail.com");
		Loginobj.loginsubmit().click();
		Thread.sleep(2000);
		if(Loginobj.loginunregmailprompt.isDisplayed()==true) {
			test.log(LogStatus.PASS, "Test Passed");
		} else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
		Assert.assertEquals(Loginobj.loginunregmailprompt.isDisplayed(),true);
		driver.navigate().refresh();
	}
	
	@Test (priority=12)
	public void loginfunctionality6() throws InterruptedException {
		test=extent.startTest("Verify OTP is not recieved on entering invalid mail-id in login section");
		Loginobj.loginicon.click();
		Thread.sleep(3000);
		driver.switchTo().frame("auth-login-ui");
		Loginobj.loginbymail.click();
		Loginobj.loginmail.sendKeys(" ");
		Loginobj.loginsubmit().click();
		Thread.sleep(2000);
		if(Loginobj.logininvalidmailprompt.isDisplayed()==true) {
			test.log(LogStatus.PASS, "Test Passed");
		} else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
		Assert.assertEquals(Loginobj.logininvalidmailprompt.isDisplayed(),true);
		driver.navigate().refresh();
	}
	
	@Test (priority=13)
	public void signupui1() throws InterruptedException {
		test=extent.startTest("Verify name field is visible on signup section");
		Loginobj.signupicon.click();
		Thread.sleep(3000);
		if(Loginobj.signupname.isDisplayed()==true) {
			test.log(LogStatus.PASS, "Test Passed");
		} else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
		Assert.assertEquals(Loginobj.signupname.isDisplayed(),true);
	}
	
	@Test (priority=14)
	public void signupui2() throws InterruptedException {
		test=extent.startTest("Verify name field is enabled on signup section");
		Thread.sleep(3000);
		if(Loginobj.signupname.isEnabled()==true) {
			test.log(LogStatus.PASS, "Test Passed");
		} else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
		Assert.assertEquals(Loginobj.signupname.isEnabled(),true);
	}
	
	@Test (priority=15)
	public void signupui3() throws InterruptedException {
		test=extent.startTest("Verify email id field is visible on signup section");
		Thread.sleep(3000);
		if(Loginobj.signupemail.isDisplayed()==true) {
			test.log(LogStatus.PASS, "Test Passed");
		} else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
		Assert.assertEquals(Loginobj.signupemail.isDisplayed(),true);
	}
	
	@Test (priority=16)
	public void signupui4() throws InterruptedException {
		test=extent.startTest("Verify email id field is enabled on signup section");
		Thread.sleep(3000);
		if(Loginobj.signupemail.isEnabled()==true) {
			test.log(LogStatus.PASS, "Test Passed");
		} else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
		Assert.assertEquals(Loginobj.signupemail.isEnabled(),true);
	}
	
	@Test (priority=17)
	public void signupui5() throws InterruptedException {
		test=extent.startTest("Verify checkbox is visible on signup section");
		Thread.sleep(3000);
		if(Loginobj.signupcheckbox.isDisplayed()==true) {
			test.log(LogStatus.PASS, "Test Passed");
		} else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
		Assert.assertEquals(Loginobj.signupcheckbox.isDisplayed(),true);
	}
	
	@Test (priority=18)
	public void signupui6() throws InterruptedException {
		test=extent.startTest("Verify checkbox is enabled on signup section");
		Thread.sleep(3000);
		if(Loginobj.signupcheckbox.isEnabled()==true) {
			test.log(LogStatus.PASS, "Test Passed");
		} else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
		Assert.assertEquals(Loginobj.signupcheckbox.isEnabled(),true);
	}
	
	@Test (priority=19)
	public void signupui7() throws InterruptedException {
		test=extent.startTest("Verify submit button is visible on signup section");
		Thread.sleep(3000);
		if(Loginobj.signupsubmit.isDisplayed()==true) {
			test.log(LogStatus.PASS, "Test Passed");
		} else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
		Assert.assertEquals(Loginobj.signupsubmit.isDisplayed(),true);
	}
	
	@Test (priority=20)
	public void signupui8() throws InterruptedException {
		test=extent.startTest("Verify submit button is enabled on signup section");
		Thread.sleep(3000);
		if(Loginobj.signupsubmit.isEnabled()==true) {
			test.log(LogStatus.PASS, "Test Passed");
		} else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
		Assert.assertEquals(Loginobj.signupsubmit.isEnabled(),true);
	}
	
}
