package Zomato;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zomatologin extends Zomatobase {

	//constructor
	public Zomatologin()
	{
		PageFactory.initElements(driver,this);
	}

	//WebElements : Locators + Identification
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div[2]/div[2]/div/div[1]/input")
	WebElement locationbox;
	@FindBy(xpath="/html/body/div[1]/div/div[3]/div[2]/div[2]/div/div[1]/div/div[1]")
	WebElement requiredlocation;
	@FindBy(xpath="//a[contains(text(),'Log in')]")
	WebElement loginicon;
	@FindBy(xpath="//a[contains(text(),'Sign up')]")
	WebElement signupicon;
	@FindBy(xpath="//img[@alt='Zomato logo']")
	WebElement logo;
	@FindBy(xpath="//div[contains (text(),'Delivery')]")
	WebElement deliveryicon;
	@FindBy(xpath="//div[contains (text(),'Dining Out')]")
	WebElement diningouticon;
	@FindBy(xpath="//div[contains (text(),'Nightlife')]")
	WebElement nightlifeicon;
	@FindBy(xpath="//div[contains (text(),'Filters')]")
	WebElement filtericon;
	@FindBy(xpath="//div[contains (text(),'Rating: 4.0+')]")
	WebElement ratingicon;
	@FindBy(xpath="//div[contains (text(),'Pure Veg')]")
	WebElement purevegicon;
	@FindBy(xpath="//div[contains (text(),'Cuisines')]")
	WebElement cuisineicon;
	@FindBy(xpath="//div[contains (text(),'More filters')]")
	WebElement morefiltersicon;
	@FindBy(xpath="//h2[contains(text(),'Sign up')]")
	WebElement signupprompt;
	@FindBy(xpath="//section[@label='Full Name']/section/input")
	WebElement signupname;
	@FindBy(xpath="//section[@label='Email']/section/input")
	WebElement signupemail;
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement signupcheckbox;
	@FindBy(xpath="//span[contains(text(),'Create account')]")
	WebElement signupsubmit;
	@FindBy(xpath="//h2[contains(text(),'Enter OTP')]")
	WebElement signupotp;
	@FindBy(xpath="//p[contains(text(),'Email ID already registered')]")
	WebElement signupmailregistered;
	@FindBy(xpath="//div[contains(text(),'Please enter a valid name')]")
	WebElement signupinvalidname;
	@FindBy(xpath="//div[contains(text(),'Invalid Email id')]")
	WebElement signupinvalidmail;
	@FindBy(xpath="//input[@placeholder='Phone' or @inputmode='numeric']")
	WebElement loginphone;
	@FindBy(xpath="//span[contains(text(),'Send One Time Password')]")
	WebElement loginsubmit;
	@FindBy(xpath="//i[@size='16']")
	WebElement logindropdown;
	@FindBy(xpath="//img[@alt='India-flag']")
	WebElement loginindia;
	@FindBy(xpath="//input[@type='number']")
	WebElement logindiv;
	@FindBy(xpath="//h2[contains(text(),'OTP Verification')]")
	WebElement loginotp;
	@FindBy(xpath="//p[contains(text(),'Please enter phone number')]")
	WebElement loginprompt;
	@FindBy(xpath="//span[contains(text(),'Continue with Email')]")
	WebElement loginbymail;
	@FindBy(xpath="//input[@type='text']")
	WebElement loginmail;
	@FindBy(xpath="//div[contains(text(),'This email is not registered with us. Please sign up.')]")
	WebElement loginunregmailprompt;
	@FindBy(xpath="//div[contains(text(),'Invalid Email id')]")
	WebElement logininvalidmailprompt;
	@FindBy(xpath="//span[contains(text(),'Continue with Google')]")
	WebElement logingoogle;
	
	
	//action methods
	public WebElement loginindia()
	{
		return loginindia;
	}
	public WebElement logindiv()
	{
		return logindiv;
	}
	public WebElement logindropdown()
	{
		return logindropdown;
	}
	public WebElement loginsubmit()
	{
		return loginsubmit;
	}
	public WebElement loginphone()
	{
		return loginphone;
	}
	public WebElement signupprompt()
	{
		return signupprompt;
	}
	public WebElement signupmailregistered()
	{
		return signupmailregistered;
	}
	public WebElement signupotp()
	{
		return signupotp;
	}
	public void setsignup(String name, String email) throws InterruptedException
	{
		signupname.clear();
		signupname.sendKeys(name);
		signupemail.clear();
		signupemail.sendKeys(email);
		signupcheckbox.click();
		Thread.sleep(3000);
		signupsubmit.click();
	}
	
	public void setlogin(String number) throws InterruptedException
	{
		Thread.sleep(3000);
		logindropdown.click();
		loginindia.click();
		logindiv.click();
		loginphone.sendKeys(number);
		loginsubmit.click();
	}
	public void setsignup2(String name, String email) throws InterruptedException
	{
		signupname.clear();
		signupname.sendKeys(name);
		signupemail.clear();
		signupemail.sendKeys(email);
	}
	
	public void f2() throws InterruptedException {
	requiredlocation.click();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(7000);
	signupicon.click();
	}
	public WebElement filtericon()
	{
		return filtericon;
	}
	public WebElement ratingicon()
	{
		return ratingicon;
	}
	public WebElement purevegicon()
	{
		return purevegicon;
	}
	public WebElement cuisineicon()
	{
		return cuisineicon;
	}
	public WebElement morefiltersicon()
	{
		return morefiltersicon;
	}
	public WebElement loginicon()
	{
		return loginicon;
	}
	public WebElement logo()
	{
		return logo;
	}
	public WebElement deliveryicon()
	{
		return deliveryicon;
	}
	public WebElement diningouticon()
	{
		return diningouticon;
	}
	public WebElement nightlifeicon()
	{
		return nightlifeicon;
	}
	public WebElement signupicon()
	{
		return signupicon;
	}
	public WebElement lcbox()
	{
		return locationbox;
	}

	public void setlocation(String location) throws InterruptedException
	{
		locationbox.clear();
		locationbox.sendKeys(location);
		locationbox.click();
	}
	public void homefunc1() throws InterruptedException
	{
		setlocation("Patiala");
		//((JavascriptExecutor) driver).executeScript("scroll(176,20.4)");
		Actions ac = new Actions(driver);
		//ac.moveToElement(requiredlocation).build().perform();
		ac.moveToElement(requiredlocation);

	}
	//	public void setPassword(String password)
	//	{
	//		sd_password.clear();
	//		sd_password.sendKeys(password);
	//	}
	//	public void clickSubmit()
	//	{
	//		loginbutton.click();
	//	}
	//	public boolean checkerrorPresence()
	//	{
	//		boolean status=errorpopup.isDisplayed();
	//		return status;
	//	}

}
