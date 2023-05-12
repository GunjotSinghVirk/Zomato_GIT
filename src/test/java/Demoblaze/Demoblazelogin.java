package Demoblaze;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demoblazelogin extends Demoblazebase {

	//constructor
	public Demoblazelogin()
	{
		PageFactory.initElements(driver,this);
	}

	//WebElements : Locators + Identification
	@FindBy(id="nava")
	WebElement logo;
	@FindBy(xpath="//a[@class='nav-link' and contains(text(),'Home')]")
	WebElement home_icon;
	@FindBy(xpath="//a[@class='nav-link' and contains(text(),'Contact')]")
	WebElement contact_icon;
	@FindBy(xpath="//a[@class='nav-link' and contains(text(),'About us')]")
	WebElement aboutus_icon;
	@FindBy(xpath="//a[@class='nav-link' and contains(text(),'Cart')]")
	WebElement cart_icon;
	@FindBy(xpath="//a[@class='nav-link' and contains(text(),'Log in')]")
	WebElement login_icon;
	@FindBy(xpath="//a[@class='nav-link' and contains(text(),'Sign up')]")
	WebElement signup_icon;
	@FindBy(id="sign-username")
	WebElement sign_username;
	@FindBy(id="sign-password")
	WebElement sign_password;
	@FindBy(xpath="//button[@class='btn btn-primary' and contains(text(),'Sign up')]")
	WebElement sign_button;
	@FindBy(id="loginusername")
	WebElement login_username;
	@FindBy(id="loginpassword")
	WebElement login_password;
	@FindBy(xpath="//button[@class='btn btn-primary' and contains(text(),'Log in')]")
	WebElement loginbutton;
	@FindBy(id="logout2")
	WebElement logoutbutton;
	@FindBy(xpath="//a[@class='list-group-item' and contains(text(),'Phones')]")
	WebElement phones_sublist;
	@FindBy(xpath="//a[@class='hrefch' and contains(text(),'Samsung galaxy s6')]")
	WebElement phone1;
	@FindBy(xpath="//a[@class='hrefch' and contains(text(),'Iphone 6 32gb')]")
	WebElement phone2;
	@FindBy(xpath="//a[@class='hrefch' and contains(text(),'HTC One M9')]")
	WebElement phone3;
	@FindBy(xpath="//a[@class='btn btn-success btn-lg' and contains(text(),'Add to cart')]")
	WebElement addcartbutton;
	@FindBy(xpath="//*[@id='tbodyid']/tr[1]/td[4]/a")
	WebElement delete1;
	@FindBy(xpath="//button[@class='btn btn-success' and contains(text(),'Place Order')]")
	WebElement placeorderbutton;
	@FindBy(id="name")
	WebElement nameorder;
	@FindBy(id="country")
	WebElement countryorder;
	@FindBy(id="city")
	WebElement cityorder;
	@FindBy(id="card")
	WebElement cardorder;
	@FindBy(id="month")
	WebElement monthorder;
	@FindBy(id="year")
	WebElement yearorder;
	@FindBy(xpath="//button[@class='btn btn-primary' and contains(text(),'Purchase')]")
	WebElement purchasebutton;
	@FindBy(xpath="//div[@class='sweet-alert  showSweetAlert visible']")
	WebElement orderreciept;
	@FindBy(id="recipient-email")
	WebElement contactemail;
	@FindBy(id="recipient-name")
	WebElement contactname;
	@FindBy(id="message-text")
	WebElement contactmessage;
	@FindBy(xpath="//button[@class='btn btn-primary' and contains(text(),'Send message')]")
	WebElement contactsend;
	@FindBy(xpath="//button[@class='btn btn-secondary' and contains(text(),'Close')]")
	WebElement closebtn;

	//action methods
	public void cemail(String cmail)
	{
		contactemail.clear();
		contactemail.sendKeys(cmail);
	}
	public void cname(String cnm)
	{
		contactname.clear();
		contactname.sendKeys(cnm);
	}
	public void cmessage(String cmsg)
	{
		contactmessage.clear();
		contactmessage.sendKeys(cmsg);
	}
	public void csend()
	{
		contactsend.click();
	}
	public void cbtn()
	{
		closebtn.click();
	}
	public void contact2(String cmail, String cnm, String cmsg)
	{
		contact_icon.click();
		contactemail.sendKeys(cmail);
		contactname.sendKeys(cnm);
		contactmessage.sendKeys(cmsg);
		csend();
		
	}
	public WebElement logo_element()
	{
		return logo;
	}
	public WebElement home()
	{
		return home_icon;
	}
	public WebElement contact()
	{
		return contact_icon;
	}
	public WebElement aboutus()
	{
		return aboutus_icon;
	}
	public WebElement cart()
	{
		return cart_icon;
	}
	public WebElement login()
	{
		return login_icon;
	}
	public WebElement signup()
	{
		return signup_icon;
	}
	public void setsignuname(String username)
	{
		sign_username.clear();
		sign_username.sendKeys(username);
	}
	public void setsignpass(String password)
	{
		sign_password.clear();
		sign_password.sendKeys(password);
	}
	public void signSubmit()
	{
		sign_button.click();
	}
	public void setUsername(String username)
	{
		login_username.clear();
		login_username.sendKeys(username);
	}
	public void setPassword(String password)
	{
		login_password.clear();
		login_password.sendKeys(password);
	}
	public void clickSubmit()
	{
		loginbutton.click();
	}
	public void clicklogout()
	{
		logoutbutton.click();
	}
	public void sublistphones()
	{
		phones_sublist.click();
	}
	public void ph1()
	{
		phone1.click();
	}
	public void deletebtn()
	{
		delete1.click();
	}
	public void ph2() 
	{
		phone2.click();
	}
	public void ph3()
	{
		phone3.click();
	}
	public void addtocart()
	{
		addcartbutton.click();
	}
	public void placeorderbtn()
	{
		placeorderbutton.click();
	}
	public void purchasebtn()
	{
		purchasebutton.click();
	}
	public void loginin(String username, String password)
	{
		login_icon.click();
		login_username.sendKeys(username);
		login_password.sendKeys(password);
		loginbutton.click();
	}
	
	public void pcorder(String name, String country, String city, String card, String month, String year)
	{
		
		nameorder.sendKeys(name);
		countryorder.sendKeys(country);
		cityorder.sendKeys(city);
		cardorder.sendKeys(card);
		monthorder.sendKeys(month);
		yearorder.sendKeys(year);
		purchasebutton.click();
	}
	
	public void cfunc() throws InterruptedException
	{
		sublistphones();
		ph1();
		Thread.sleep(800);
		addtocart();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.navigate().back();
		driver.navigate().back();
		ph2();
		Thread.sleep(800);
		addtocart();
		Thread.sleep(2000);
		alert.accept();
		driver.navigate().back();
		driver.navigate().back();
		ph3();
		Thread.sleep(800);
		addtocart();
		Thread.sleep(1000);
		alert.accept();
		cart().click();
		Thread.sleep(5000);
	}
	
	public WebElement name()
	{
		return nameorder;
	}
	public WebElement country()
	{
		return countryorder;
	}
	public WebElement city()
	{
		return cityorder;
	}
	public WebElement card()
	{
		return cardorder;
	}
	public WebElement month()
	{
		return monthorder;
	}
	public WebElement year()
	{
		return yearorder;
	}
	public WebElement receipt()
	{
		return orderreciept;
	}
	
}
