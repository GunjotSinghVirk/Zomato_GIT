package Demoblaze;

import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Demoblazetest extends Demoblazebase {

	Demoblazelogin Lp;
	String actual_title;
	

	@BeforeClass
	public void Launch() throws IOException
	{
		initialization();
		Lp = new Demoblazelogin();
		
	}


	@AfterClass
	public void stop() throws IOException
	{
		terminate();	
	}

	@Test (priority=1)
	public void accesibility() {
		actual_title=driver.getTitle();
		System.out.println("Actual title : " + actual_title);
		Assert.assertEquals(actual_title, "STORE");
		System.out.println("Website is accessible and verified that Actual title and Current Title are same.");
	}

	@Test (priority=2)
	public void logovisibility() {
		Assert.assertEquals(Lp.logo.isDisplayed(),true);
		System.out.println("Logo is displayed ");
	}

	@Test (priority=3)
	public void homeiconvisibility() {
		Assert.assertEquals(Lp.home_icon.isDisplayed(),true);
		System.out.println("Home Icon is displayed ");
	}

	@Test (priority=4)
	public void contacticonvisibility() {
		Assert.assertEquals(Lp.contact_icon.isDisplayed(),true);
		System.out.println("Contact Icon is displayed ");
	}

	@Test (priority=5)
	public void aboutusiconvisibility() {
		Assert.assertEquals(Lp.aboutus_icon.isDisplayed(),true);
		System.out.println("About us Icon is displayed ");
	}

	@Test (priority=6)
	public void cartticonvisibility() {
		Assert.assertEquals(Lp.cart_icon.isDisplayed(),true);
		System.out.println("Cart Icon is displayed ");
	}

	@Test (priority=7)
	public void loginiconvisibility() {
		Assert.assertEquals(Lp.login_icon.isDisplayed(),true);
		System.out.println("Log in Icon is displayed ");
	}

	@Test (priority=8)
	public void signupiconvisibility() {
		Assert.assertEquals(Lp.signup_icon.isDisplayed(),true);
		System.out.println("Sign up Icon is displayed ");
	}

	@Test (priority=9)
	public void logoaccessibility() {
		Assert.assertEquals(Lp.logo.isEnabled(),true);
		System.out.println("Logo is Clickable ");
	}

	@Test (priority=10)
	public void homeiconaccessibility() {
		Assert.assertEquals(Lp.home_icon.isEnabled(),true);
		System.out.println("Home Icon is Clickable ");
	}

	@Test (priority=11)
	public void contacticonaccessibility() {
		Assert.assertEquals(Lp.contact_icon.isEnabled(),true);
		System.out.println("Contact Icon is Clickable ");
	}

	@Test (priority=12)
	public void aboutusiconaccessibility() {
		Assert.assertEquals(Lp.aboutus_icon.isEnabled(),true);
		System.out.println("About us Icon is Clickable ");
	}

	@Test (priority=13)
	public void cartticonaccessibility() {
		Assert.assertEquals(Lp.cart_icon.isEnabled(),true);
		System.out.println("Cart Icon is Clickable ");
	}

	@Test (priority=14)
	public void loginiconaccessibility() {
		Assert.assertEquals(Lp.login_icon.isEnabled(),true);
		System.out.println("Log in Icon is Clickable ");
	}

	@Test (priority=15)
	public void signupiconaccessibility() {
		Assert.assertEquals(Lp.signup_icon.isEnabled(),true);
		System.out.println("Sign up Icon is Clickable ");
	}

	@Test (priority=16)
	public void signupfunctionality() throws InterruptedException {
		Lp.signup_icon.click();
		Lp.setsignuname(prop.getProperty("username1"));
		Lp.setsignpass(prop.getProperty("password1"));
		Lp.signSubmit();
		Thread.sleep(1500);
		Alert alert = driver.switchTo().alert();		    
		String alertMessage= alert.getText();
		alert.accept();
		Assert.assertEquals(alertMessage,"This user already exist.");
		System.out.println("Verified popup on entering details of existing user");
		Thread.sleep(1000);
		driver.navigate().refresh();     
	}

	@Test (priority=17)
	public void signupfunctionality2() throws InterruptedException {
		Lp.signup_icon.click();
		Lp.setsignuname(prop.getProperty("username2"));
		Lp.setsignpass(prop.getProperty("password2"));
		Lp.signSubmit();
		Thread.sleep(1500);
		Alert alert = driver.switchTo().alert();		    
		String alertMessage= alert.getText();
		alert.accept();
		Assert.assertEquals(alertMessage,"Sign up successful.");
		System.out.println("Successful signup on entering details of new user");
		Thread.sleep(1000);
		driver.navigate().refresh();
	}

	@Test (priority=18)
	public void loginfunctionality() throws InterruptedException {
		Thread.sleep(1000);
		Lp.login_icon.click();
		Lp.setUsername(prop.getProperty("username3"));
		Lp.setPassword(prop.getProperty("password1"));
		Lp.clickSubmit();
		Thread.sleep(5000);
		Assert.assertEquals(Lp.logoutbutton.isDisplayed(),true);
		System.out.println("Verified successfull login to application using valid username and valid passsword");
		Lp.clicklogout();
	}
	
	@Test (priority=19)
	public void loginfunctionality2() throws InterruptedException {
		Thread.sleep(1500);
		Lp.login_icon.click();
		Lp.setUsername(prop.getProperty("username4"));
		Lp.setPassword(prop.getProperty("password1"));
		Lp.clickSubmit();
		Thread.sleep(1500);
		Alert alert = driver.switchTo().alert();		    
		String alertMessage= alert.getText();
		Thread.sleep(1000);
		alert.accept();
		Assert.assertEquals(alertMessage,"User does not exist.");
		System.out.println("Verified unsuccessfull login to application using unregistered username and valid passsword");
		driver.navigate().refresh();
	}
	
	@Test (priority=20)
	public void loginfunctionality3() throws InterruptedException {
		Thread.sleep(1500);
		Lp.login_icon.click();
		Lp.setUsername(prop.getProperty("username1"));
		Lp.setPassword(prop.getProperty("password1"));
		Lp.clickSubmit();
		Thread.sleep(1500);
		Alert alert = driver.switchTo().alert();		    
		String alertMessage= alert.getText();
		Thread.sleep(1000);
		alert.accept();
		Assert.assertEquals(alertMessage,"Wrong password.");
		System.out.println("Verified unsuccessfull login to application using registered username and invalid passsword");
		driver.navigate().refresh();
	}
	
	@Test (priority=21)
	public void loginfunctionality4() throws InterruptedException {
		Thread.sleep(1500);
		Lp.login_icon.click();
		Lp.setUsername(prop.getProperty("username4"));
		Lp.setPassword(prop.getProperty("password2"));
		Lp.clickSubmit();
		Thread.sleep(1500);
		Alert alert = driver.switchTo().alert();		    
		String alertMessage= alert.getText();
		Thread.sleep(1000);
		alert.accept();
		Assert.assertEquals(alertMessage,"User does not exist.");
		System.out.println("Verified unsuccessfull login to application using unregistered username and invalid passsword");
		driver.navigate().refresh();
	}
	
	@Test (priority=22)
	public void loginfunctionality5() throws InterruptedException {
		Thread.sleep(1500);
		Lp.login_icon.click();
		Lp.setUsername(prop.getProperty("username3"));
		//Lp.setPassword(prop.getProperty("password2"));
		Lp.clickSubmit();
		Thread.sleep(1500);
		Alert alert = driver.switchTo().alert();		    
		String alertMessage= alert.getText();
		Thread.sleep(1000);
		alert.accept();
		Assert.assertEquals(alertMessage,"Please fill out Username and Password.");
		System.out.println("Verified unsuccessfull login to application using registered username and blank passsword");
		driver.navigate().refresh();
	}
	
	@Test (priority=23)
	public void loginfunctionality6() throws InterruptedException {
		Thread.sleep(1500);
		Lp.login_icon.click();
		//Lp.setUsername(prop.getProperty("username3"));
		Lp.setPassword(prop.getProperty("password2"));
		Lp.clickSubmit();
		Thread.sleep(1500);
		Alert alert = driver.switchTo().alert();		    
		String alertMessage= driver.switchTo().alert().getText();
		Thread.sleep(1000);
		alert.accept();
		Assert.assertEquals(alertMessage,"Please fill out Username and Password.");
		System.out.println("Verified unsuccessfull login to application using blank username and valid passsword");
		driver.navigate().refresh();
	}
	
	@Test (priority=24)
	public void loginfunctionality7() throws InterruptedException {
		Thread.sleep(1500);
		Lp.login_icon.click();
		//Lp.setUsername(prop.getProperty("username3"));
		//Lp.setPassword(prop.getProperty("password2"));
		Lp.clickSubmit();
		Thread.sleep(1500);
		Alert alert = driver.switchTo().alert();		    
		String alertMessage= driver.switchTo().alert().getText();
		Thread.sleep(1000);
		alert.accept();
		Assert.assertEquals(alertMessage,"Please fill out Username and Password.");
		System.out.println("Verified unsuccessfull login to application using blank username and blank passsword");
		driver.navigate().refresh();
	}
	
	@Test (priority=25)
	public void cartfunctionality() throws InterruptedException {
		Thread.sleep(1500);
		Lp.loginin(prop.getProperty("username3"), prop.getProperty("password1"));
		Thread.sleep(2000);
		Lp.cfunc();
		String cartitems = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover table-striped']")).getText();
		System.out.println(cartitems);
	}
}

